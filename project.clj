(defproject net.ofnir/antizer "3.26.17-0"
  :description "Antizer"
  :url "https://github.com/christoph-frick/antizer"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :deploy-repositories [["releases" {:password :gpg
                                     :username :gpg
                                     :url "https://clojars.org/repo/"}]]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.520"]
                 [cljsjs/antd "3.26.17-0"]
                 [cljsjs/moment "2.24.0-0"]])
