package mx.itesm.secondexample;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context;
    Toast MyToast;
    AlertDialog.Builder DialogConf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        MyToast = new Toast(context);
        String text = "Hello Toast";

        //MyToast.makeText(context, text, Toast.LENGTH_LONG);
        //MyToast.show();


        DialogConf = new AlertDialog.Builder(this);
        DialogConf.setTitle("Confirmation Dialog");
        DialogConf.setMessage("This is the Text of the Dialog");
        DialogConf.setIcon(R.mipmap.ic_launcher);

        DialogConf.setNeutralButton("close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(context, "This is a toast", Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog MyDialog = DialogConf.create();
        MyDialog.show();

        /*
        AlertDialog.Builder SecondDialogConf = new AlertDialog.Builder(this);
        SecondDialogConf.setTitle("Confirmation Dialog");
        SecondDialogConf.setMessage("this is the third text of the dialog");
        SecondDialogConf.setIcon(R.mipmap.ic_launcher);

        final EditText TextInput = new EditText(context);
        TextInput.setTextColor(Color.BLUE);
        SecondDialogConf.setView(TextInput);

        SecondDialogConf.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                String str = TextInput.getEditableText().toString();
                Toast.makeText(context,"You wrote this in the dialog: " +str, Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog secondDialog = SecondDialogConf.create();
        secondDialog.show();
        */
        int NOTIF_ID = 1234;
        Notification.Builder NotifBuilder = new Notification.Builder(this);
        NotifBuilder.setSmallIcon(R.mipmap.ic_launcher);
        NotifBuilder.setContentTitle("Important Notif");
        NotifBuilder.setContentText("This is he detail");

        Intent notificationIntent = new Intent(this,SecondActivity.class);
        notificationIntent.putExtra("myData","this string comesfrom the previous action");
        PendingIntent contentIntent = PendingIntent.getActivity(context,0,notificationIntent,0);

        NotifBuilder.setContentIntent(contentIntent);

        NotificationManager myNotif = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        myNotif.notify(NOTIF_ID, NotifBuilder.build());

    }
}
