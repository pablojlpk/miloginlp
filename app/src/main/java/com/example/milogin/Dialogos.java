package com.example.milogin;


import android.app.Activity;
        import android.app.AlertDialog;
        import android.app.ProgressDialog;
        import android.app.TimePickerDialog;
        import android.content.Context;
        import android.content.DialogInterface;

        import android.util.Log;
        import android.webkit.RenderProcessGoneDetail;
        import android.widget.TimePicker;
        import android.widget.Toast;

        import java.time.LocalTime;
        import java.util.logging.ConsoleHandler;
        import android.os.Handler;
        import java.util.logging.LogRecord;

public class Dialogos  {

    public static void mostrarDialogo(Activity activity){

        new AlertDialog.Builder(activity)
                .setTitle("Bye Bye")
                .setMessage("Cerrar la aplicación ?")
                .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        activity.finish();

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(activity, "Continuamos trabajando", Toast.LENGTH_SHORT).show();
                    }
                }).show();
    }

}
