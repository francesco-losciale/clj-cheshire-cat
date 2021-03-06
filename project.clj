(defproject clj-cheshire-cat "0.1.0-SNAPSHOT"
  :description "Simple ClojureScript front-end"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371"]
                 [compojure "1.3.1"]
                 [ring/ring-defaults "0.1.2"]
                 [ring/ring-json "0.3.1"]
                 [cljs-http "0.1.18"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [enfocus "2.1.0"]]
  :plugins [[lein-ring "0.8.13"]
            [lein-cljsbuild "1.0.3"]
            [org.clojure/core.unify "0.5.7"]]
  :ring {:handler clj-cheshire-cat.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}}
  :cljsbuild {
              :builds [{
                        :source-paths ["src-cljs"]
                        :compiler {
                                   :output-to "resources/public/main.js"  ; default: target/cljsbuild-main.js
                                   :optimizations :whitespace
                                   :pretty-print true}}]})
