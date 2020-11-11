(ns clj-cheshire-cat.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [cheshire.core :as json]))

(defroutes app-routes
           (GET "/" [] "Hello World")
           (GET "/cheshire-cat" []
             (json/generate-string                          ; if we use ring-json we can remove this line
               {:name "Cheshire Cat"
                :status :grinning}))
           (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
