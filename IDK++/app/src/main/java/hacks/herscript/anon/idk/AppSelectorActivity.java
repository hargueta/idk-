package hacks.herscript.anon.idk;

import android.content.ClipData;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AppSelectorActivity extends AppCompatActivity {
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_selector);

        List<PackageInfo> apps = getPackageManager().getInstalledPackages(0);

        ArrayList<AppInfo> res = new ArrayList<AppInfo>();

        for(int i=0;i<apps.size();i++) {
            PackageInfo p = apps.get(i);

            AppInfo newInfo = new AppInfo();
            newInfo.appname = p.applicationInfo.loadLabel(getPackageManager()).toString();
            newInfo.pname = p.packageName;
            newInfo.versionName = p.versionName;
            newInfo.versionCode = p.versionCode;
            newInfo.icon = p.applicationInfo.loadIcon(getPackageManager());
            res.add(newInfo);
        }




        lv = (ListView) findViewById(R.id.listview);

        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<AppInfo> arrayAdapter = new ListAdapter(this, R.layout.listitem,res);

        lv.setAdapter(arrayAdapter);



    }
}


class ListAdapter extends ArrayAdapter<AppInfo> {

    public ListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public ListAdapter(Context context, int resource, List<AppInfo> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.listitem, null);
        }

        AppInfo app = getItem(position);

        if (app != null) {
            TextView appname = (TextView) v.findViewById(R.id.appName);
            ImageView appicon = (ImageView) v.findViewById(R.id.appIcon);

            if (appname != null) {
                appname.setText(app.appname);
            }

            if (appicon != null) {
                appicon.setImageDrawable(app.icon);
            }

        }

        return v;
    }

}
