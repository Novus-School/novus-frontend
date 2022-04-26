(ns app.view
  (:require [reagent.core :as r]
            ["/components/Button" :refer [Button]]
            ["/components/Alert" :refer [Alert]]
            ["/hooks/react" :refer [useCallback useState]]))

(js/console.log useState)

(defn custom-hooks-counter []
  (let [[count set-count] (useState 0)
        set-counter (useCallback
                     (fn [] (set-count (inc count)))
                     (clj->js [count]))]
    [:div
     [:div (str "Counter: " count)]
     [:button
      {:on-click set-counter}
      "Inc"]]))


(defn main-view []
  (let [is-alert-open (r/atom false)]
    (fn []
      [:div.m-8
       [:nav.mb-8
        [:h1.font-600 "novus"]]
       [:div.my-16
        [:h1.uppercase "Where Kids learn to"
         [:strong.block "solve problems together"]]
        [:> Alert {:message "You lost, the word was"
                   :isOpen @is-alert-open}]
        [:> Button {:title (if @is-alert-open "Close" "Open")
                    :onClick #(reset! is-alert-open (not @is-alert-open))}]
        [:f> custom-hooks-counter]]])))