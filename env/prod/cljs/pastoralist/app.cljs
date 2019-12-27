(ns pastoralist.app
  (:require [pastoralist.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init! false)
