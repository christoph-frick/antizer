(ns antizer.rum-macros)

(defn detect
  [interpret]
  (try
    (require (symbol (namespace interpret)))
    interpret
    (catch Exception _)))

;; since rum 0.12 sablono got replaced by daiquiri
(def interpreter
  (let [options ['sablono.interpreter/interpret
                 'daiquiri.compiler/interpret-maybe]
        result (some detect options)]
    (if result
      result
      (throw (ex-info "Can not detect interpreter for hiccup-like syntax" 
                      {:search-space options})))))

(defmacro interpret
  [& args]
  `(~interpreter ~@args))
