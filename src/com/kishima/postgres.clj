(ns com.kishima.postgres
  "Postgres component for biff."
  (:require [clojure.tools.logging :as log]
            [com.biffweb :as biff]
            [clojure.java.jdbc :as j]))

(defn use-postgres
  "Returns a connection to Postgres. Expects config.edn to have the following keys:
  {`:biff.postgres/dbtype`   \"postgresql\"
   `:biff.postgres/port`     \"5432\"
   `:biff.postgres/host`     \"localhost\"
   `:biff.postgres/user`     \"postgres\"
   `:biff.postgres/password` \"example\"
   `:biff.postgres/dbname`   \"postgres\"}

  The values here are only examples.
  "
  [{:keys [biff/secret]
    :biff.postgres/keys [dbtype port user password dbname host]
    :as ctx}]
  (log/info :postgres "Connecting to Postgres...")
  (try
    (let [config     {:dbtype dbtype
                      :port port
                      :user user
                      :host host
                      :password password
                      :dbname dbname}
          connection (j/get-connection config)]
      (log/info :postgres "Connection successful!")
      connection)
    (catch Exception e
      (log/error :postgres (str "Failed to connect to Postgres\n" e)))))
