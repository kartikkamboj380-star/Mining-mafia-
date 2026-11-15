package p002a1;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import cl.json.e;
import cl.json.f;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.Scopes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ReactApplicationContext f7252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Intent f7253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f7254c = "Share";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f7255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ReadableMap f7256e;

    public n(ReactApplicationContext reactApplicationContext) {
        this.f7252a = reactApplicationContext;
        n(new Intent("android.intent.action.SEND"));
        f().setType("text/plain");
    }

    private ComponentName[] c(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        Intent intent = new Intent(f().getAction());
        intent.setType(f().getType());
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> listQueryIntentActivities = this.f7252a.getPackageManager().queryIntentActivities(intent, 0);
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            String string = readableArray.getString(i10);
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                if (resolveInfo.activityInfo.packageName.equals(string)) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
                }
            }
        }
        return (ComponentName[]) arrayList.toArray(new ComponentName[0]);
    }

    public static boolean j(String str, ReadableMap readableMap) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? false : true;
    }

    public static boolean k(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    protected static String o(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("URLEncoder.encode() failed for " + str);
        }
    }

    protected String a() {
        return null;
    }

    protected abstract String b();

    protected e d(ReadableMap readableMap) {
        String string = j("filename", readableMap) ? readableMap.getString("filename") : null;
        Boolean boolValueOf = Boolean.FALSE;
        if (j("useInternalStorage", readableMap)) {
            boolValueOf = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool = boolValueOf;
        return j(HandleInvocationsFromAdViewer.KEY_AD_TYPE, readableMap) ? new e(readableMap.getString("url"), readableMap.getString(HandleInvocationsFromAdViewer.KEY_AD_TYPE), string, bool, this.f7252a) : new e(readableMap.getString("url"), string, bool, this.f7252a);
    }

    protected f e(ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        if (j("filenames", readableMap)) {
            ReadableArray array = readableMap.getArray("filenames");
            for (int i10 = 0; i10 < array.size(); i10++) {
                arrayList.add(array.getString(i10));
            }
        }
        Boolean boolValueOf = Boolean.FALSE;
        if (j("useInternalStorage", readableMap)) {
            boolValueOf = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool = boolValueOf;
        return j(HandleInvocationsFromAdViewer.KEY_AD_TYPE, readableMap) ? new f(readableMap.getArray("urls"), arrayList, readableMap.getString(HandleInvocationsFromAdViewer.KEY_AD_TYPE), bool, this.f7252a) : new f(readableMap.getArray("urls"), arrayList, bool, this.f7252a);
    }

    protected Intent f() {
        return this.f7253b;
    }

    protected Intent[] g(Intent intent, Uri uri) {
        List<ResolveInfo> listQueryIntentActivities = this.f7252a.getPackageManager().queryIntentActivities(intent, 0);
        Intent[] intentArr = new Intent[listQueryIntentActivities.size()];
        for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(i10);
            String str = resolveInfo.activityInfo.packageName;
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
            intent2.setAction("android.intent.action.VIEW");
            intent2.setDataAndType(uri, intent.getType());
            intent2.addFlags(1);
            intentArr[i10] = new Intent(intent2);
        }
        return intentArr;
    }

    protected abstract String h();

    protected abstract String i();

    public void l(ReadableMap readableMap) {
        this.f7256e = readableMap;
        if (j("isNewTask", readableMap) && readableMap.getBoolean("isNewTask")) {
            f().addFlags(268468224);
        }
        if (j("subject", readableMap)) {
            f().putExtra("android.intent.extra.SUBJECT", readableMap.getString("subject"));
        }
        if (j(Scopes.EMAIL, readableMap)) {
            f().putExtra("android.intent.extra.EMAIL", new String[]{readableMap.getString(Scopes.EMAIL)});
        }
        if (j("title", readableMap)) {
            this.f7254c = readableMap.getString("title");
        }
        String string = j(PglCryptUtils.KEY_MESSAGE, readableMap) ? readableMap.getString(PglCryptUtils.KEY_MESSAGE) : "";
        String string2 = j("social", readableMap) ? readableMap.getString("social") : "";
        if (string2.equals("sms")) {
            String string3 = readableMap.getString("recipient");
            if (!string3.isEmpty()) {
                f().putExtra("address", string3);
            }
        }
        if (string2.equals("whatsapp") && readableMap.hasKey("whatsAppNumber")) {
            f().putExtra("jid", readableMap.getString("whatsAppNumber") + "@s.whatsapp.net");
        }
        if (string2.equals("whatsappbusiness") && readableMap.hasKey("whatsAppNumber")) {
            f().putExtra("jid", readableMap.getString("whatsAppNumber") + "@s.whatsapp.net");
        }
        if (j("urls", readableMap)) {
            f fVarE = e(readableMap);
            if (!fVarE.f()) {
                if (TextUtils.isEmpty(string)) {
                    f().putExtra("android.intent.extra.TEXT", readableMap.getArray("urls").getString(0));
                    return;
                }
                f().putExtra("android.intent.extra.TEXT", string + " " + readableMap.getArray("urls").getString(0));
                return;
            }
            ArrayList arrayListD = fVarE.d();
            ClipData clipData = new ClipData(new ClipDescription("Files", new String[]{fVarE.c()}), new ClipData.Item((Uri) arrayListD.get(0)));
            for (int i10 = 1; i10 < arrayListD.size(); i10++) {
                clipData.addItem(new ClipData.Item((Uri) arrayListD.get(i10)));
            }
            f().setClipData(clipData);
            f().setAction("android.intent.action.SEND_MULTIPLE");
            f().setType(fVarE.c());
            f().putParcelableArrayListExtra("android.intent.extra.STREAM", arrayListD);
            f().addFlags(1);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            f().putExtra("android.intent.extra.TEXT", string);
            return;
        }
        if (!j("url", readableMap)) {
            if (TextUtils.isEmpty(string)) {
                return;
            }
            f().putExtra("android.intent.extra.TEXT", string);
            return;
        }
        e eVarD = d(readableMap);
        this.f7255d = eVarD;
        if (eVarD.f()) {
            Uri uriD = this.f7255d.d();
            ClipData clipDataNewUri = ClipData.newUri(this.f7252a.getContentResolver(), "File", uriD);
            f().setType(this.f7255d.c());
            f().setClipData(clipDataNewUri);
            f().putExtra("android.intent.extra.STREAM", uriD);
            f().addFlags(1);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            f().putExtra("android.intent.extra.TEXT", string);
            return;
        }
        if (TextUtils.isEmpty(string)) {
            f().putExtra("android.intent.extra.TEXT", readableMap.getString("url"));
            return;
        }
        f().putExtra("android.intent.extra.TEXT", string + " " + readableMap.getString("url"));
    }

    protected void m() {
        Intent intentCreateChooser;
        IntentSender intentSenderC;
        Activity currentActivity = this.f7252a.getCurrentActivity();
        if (currentActivity == null) {
            r.a("Something went wrong");
            return;
        }
        if (r.d()) {
            intentSenderC = r.c(this.f7252a);
            intentCreateChooser = Intent.createChooser(f(), this.f7254c, intentSenderC);
        } else {
            intentCreateChooser = Intent.createChooser(f(), this.f7254c);
            intentSenderC = null;
        }
        intentCreateChooser.addFlags(1073741824);
        if (j("showAppsToView", this.f7256e) && j("url", this.f7256e)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setType(this.f7255d.c());
            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", g(intent, this.f7255d.d()));
        }
        if (j("excludedActivityTypes", this.f7256e)) {
            intentCreateChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", c(this.f7256e.getArray("excludedActivityTypes")));
            currentActivity.startActivityForResult(intentCreateChooser, 16845);
        } else {
            currentActivity.startActivityForResult(intentCreateChooser, 16845);
        }
        if (intentSenderC == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("success", true);
            writableMapCreateMap.putString(PglCryptUtils.KEY_MESSAGE, "OK");
            r.b(writableMapCreateMap);
        }
    }

    protected void n(Intent intent) {
        this.f7253b = intent;
    }
}
