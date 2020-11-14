(ns cheshire.core
  (:require [clojure.browser.repl :as repl]))

; ^:export is metadata that allows you to annotate functions and pass additional information to the compiler
(defn ^:export init []
  (repl/connect "http://localhost:9000/repl"))