
(defn- bubble-increasing [bs a]
  (if-let [b (peek bs)]
    (if (> b a)
      (conj (pop bs) a b)
      (conj bs a))
    [a]))

(defn- bubble-decresing [bs a]
  (if-let [b (peek bs)]
    (if (< b a)
      (conj (pop bs) a b)
      (conj bs a))
    [a]))

(defn bubble [as]
  (let [bs (reduce bubble-increasing [] as)]
    (if (= as bs)
      as
      (recur bs))))

(bubble [3 0 1])