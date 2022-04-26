(ns app.view
  (:require [reagent.core :as r]
            ["/components/Button" :refer [Button]]
            ["/components/Alert" :refer [Alert]]
            ["/hooks/react" :refer [useCallback useState]]))

(js/console.log useState)

(defn hooks-counter []
  (let [[count set-count] (useState 0)
        set-counter (useCallback
                     (fn [] (set-count (inc count)))
                     (clj->js [count]))]
    [:div
     [:div (str "Counter: " count)]
     [:button
      {:on-click set-counter}
      "Inc"]]))


(defn click-counter [click-count]
  [:div
   "The atom " [:code "click-count"] " has value: "
   @click-count ". "
   [:input {:type "button" :value "Click me!"
            :on-click #(swap! click-count inc)}]])

(def click-count (r/atom 0))

(defn main-view []
  [:<>
   [:p "Hello, fungus-client is running!"]
   [:p "Here's an example of using a component with state:"]
   [:> Alert {:message "You lost, the word was"
              :isOpen true}]
   [:> Button {:title "Hello TSX"}]
   [:f> hooks-counter]
   [click-counter click-count]])
