(ns quux.t-core2
  (:use midje.sweet)
  (:use [quux.core]))

(fact "default value is returned for empty sequences"
      (first-element [] :default1) => :default
      (first-element '() :default1) => :default
      (first-element nil :default1) => :default
      (first-element (filter even? [1 3 5]) :default) => :default)
