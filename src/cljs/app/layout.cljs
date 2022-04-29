(ns app.layout
  (:require
   [app.routes :refer [routes-state]]
   ;; components
   [app.components.navbar :refer [navbar]]))

(comment
  @routes-state)
(defn app []
  [:div
   [navbar]
   (let [current-view (-> @routes-state :data :view)]
     [current-view @routes-state])])
