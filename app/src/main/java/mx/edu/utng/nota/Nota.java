package mx.edu.utng.nota;

import java.util.UUID;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "nota")
public class Nota {
    @PrimaryKey
    @NonNull
    private String mId;
    @ColumnInfo(name = "contenido")
    private String mMensaje;

    public Nota() {
        mId = UUID.randomUUID().toString();
    }

    @NonNull
    public String getId() {
        return mId;
    }

    public void setId(@NonNull String id) {
        mId = id;
    }

    public String getMensaje() {
        return mMensaje;
    }

    public void setMensaje(String mensaje) {
        mMensaje = mensaje;
    }
}
