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
      [:div.m-12
       [:> Alert {:message "Welcome to novus"
                  :isOpen @is-alert-open}]
       [:nav.mb-8
        [:h1.font-600 "novus"]]
       [:div.my-16
        [:h1.uppercase.text-6xl "Where developers"
         [:span.block " become "]
         [:strong.block "problem solvers"]]
        [:div.my-8
         [:h3.text-2xl.font-light "novus challenges curious learners through "
          [:strong.font-medium "complex games and simulations"]]
         [:> Button {:title "Get Started"}]]
        [:div.my-16
         [:h1.uppercase. "Why novus?"]]]])))
