(ns app.layout
  (:require
   [app.routes :refer [routes-state]]
   ;; components
   [app.components.navbar :refer [navbar]]
   ["/react_query/index" :refer [QueryClientProvider]]))

(comment
  @routes-state)
(defn app []
  [:> QueryClientProvider
   [:div
    [navbar]
    (let [current-view (-> @routes-state :data :view)]
      [current-view @routes-state])]])
