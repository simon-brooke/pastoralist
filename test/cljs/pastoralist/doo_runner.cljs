(ns pastoralist.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [pastoralist.core-test]))

(doo-tests 'pastoralist.core-test)

