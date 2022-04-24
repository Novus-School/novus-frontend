(ns app.hello
  (:require [reagent.core :as r]
            ["/components/ui/Button" :refer [Button]]))

(defn click-counter [click-count]
  [:div
   "The atom " [:code "click-count"] " has value: "
   @click-count ". "
   [:input {:type "button" :value "Click me!"
            :on-click #(swap! click-count inc)}]])

(def click-count (r/atom 0))

(defn hello []
  [:<>
   [:p "Hello, fungus-client is running!"]
   [:p "Here's an example of using a component with state:"]
   [:> Button {:title "Hello TSX"}]
   [click-counter click-count]])
