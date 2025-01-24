(ns user
  (:require [ring.adapter.jetty :as jetty]
            [example.lambda-app :refer [app]]))

(defn -main [& _]
  (jetty/run-jetty #'app {:port 8080 :host "0.0.0.0" :join? false}))
