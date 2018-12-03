(defproject advent "0.1.0-SNAPSHOT"
  :description "Solutions to the 2018 Advent of Code"
  :url "https://github.com/magisus/adventofcode2018"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]]

  :main ^:skip-aot advent.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
