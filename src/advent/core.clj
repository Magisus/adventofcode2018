(ns advent.core
  (:gen-class)
  (:require [clojure.string :as string]))

(defn -main
  [& args]
  (let [input (string/trim (slurp "resources/day1_input.txt"))
        num-strings (string/split input #"\n")
        nums (map #(Integer/parseInt %) num-strings)]
    (reduce + nums)))
