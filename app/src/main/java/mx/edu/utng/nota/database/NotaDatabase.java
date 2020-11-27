package mx.edu.utng.nota.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import mx.edu.utng.nota.Nota;

@Database(entities = {Nota.class}, version = 1)
public abstract class NotaDatabase extends RoomDatabase {
    public abstract NotaDao getNotaDao();
}
