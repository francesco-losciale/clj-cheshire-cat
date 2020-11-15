(ns clj-cheshire-cat.macro-test
  (:require [clojure.test :refer :all]))

(defn hi-queen [phrase]
  (str phrase ", so please your Majesty."))

(defn alice-hi-queen []
  (hi-queen "My name is Alice"))

(defn march-hare-hi-queen []
  (hi-queen "My name is March Hare"))

(deftest test-app
  (testing "Test Alice introduction"
    (is (= (alice-hi-queen) "My name is Alice, so please your Majesty.")))
  (testing "Test March Hare introduction"
    (is (= (march-hare-hi-queen) "My name is March Hare, so please your Majesty."))))