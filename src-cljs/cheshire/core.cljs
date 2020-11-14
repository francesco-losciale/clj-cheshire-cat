(ns cheshire.core)

; ^:export is metadata that allows you to annotate functions and pass additional information to the compiler
(defn ^:export init []
  (js/alert "hi there"))