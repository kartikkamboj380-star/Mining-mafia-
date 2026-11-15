package io.invertase.firebase.messaging;

import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.W;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class x implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45212a = ",";

    private List d(String str) {
        return new ArrayList(Arrays.asList(str.split(",")));
    }

    private String e(String str, String str2) {
        return str2.replace(str + ",", "");
    }

    @Override // io.invertase.firebase.messaging.v
    public void a(String str) {
        p089i8.o oVarB = p089i8.o.b();
        oVarB.d(str).apply();
        String strC = oVarB.c("all_notification_ids", "");
        if (strC.isEmpty()) {
            return;
        }
        oVarB.e("all_notification_ids", e(str, strC));
    }

    @Override // io.invertase.firebase.messaging.v
    public WritableMap b(String str) {
        String strC = p089i8.o.b().c(str, null);
        if (strC != null) {
            try {
                WritableMap writableMapB = a.b(new JSONObject(strC));
                writableMapB.putString("to", str);
                return writableMapB;
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    @Override // io.invertase.firebase.messaging.v
    public void c(W w10) {
        try {
            String string = a.d(u.i(w10)).toString();
            p089i8.o oVarB = p089i8.o.b();
            List listD = d(oVarB.c("all_notification_ids", ""));
            while (listD.size() > 99) {
                a((String) listD.get(0));
                listD.remove(0);
            }
            String strC = oVarB.c("all_notification_ids", "");
            oVarB.e(w10.J(), string);
            oVarB.e("all_notification_ids", strC + w10.J() + ",");
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
