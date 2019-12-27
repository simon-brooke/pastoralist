(ns pastoralist.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [pastoralist.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[pastoralist started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[pastoralist has shut down successfully]=-"))
   :middleware wrap-dev})
