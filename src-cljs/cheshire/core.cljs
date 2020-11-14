(ns cheshire.core
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [clojure.browser.repl :as repl]
            [cljs-http.client :as http]
            [cljs.core.async :refer [<!]]
            [enfocus.core :as ef]))

; ^:export is metadata that allows you to annotate functions and pass additional information to the compiler
(defn ^:export init []
  (repl/connect "http://localhost:9000/repl")
  (go
    (let [response (<! (http/get "/cheshire-cat"))
          body (:body response)]
      (ef/at "#cat-name" (ef/content (:name body)))
      (ef/at "#status" (ef/content (:status body))))))