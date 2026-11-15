package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.services.core.device.MimeTypes;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class l implements ActivityEventListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final d f42180g = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f42181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DownloadManager.Request f42182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ValueCallback f42183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ValueCallback f42184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f42185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f42186f;

    class a implements D3.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f42188b;

        a(String str, String str2) {
            this.f42187a = str;
            this.f42188b = str2;
        }

        @Override // D3.g
        public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
            if (i10 != 1) {
                return false;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(l.this.f42181a, this.f42188b, 1).show();
            } else if (l.this.f42182b != null) {
                l.this.h(this.f42187a);
            }
            return true;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f42190a;

        static {
            int[] iArr = new int[c.values().length];
            f42190a = iArr;
            try {
                iArr[c.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42190a[c.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum c {
        DEFAULT("*/*"),
        IMAGE("image"),
        VIDEO(MimeTypes.BASE_TYPE_VIDEO);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f42195a;

        c(String str) {
            this.f42195a = str;
        }
    }

    protected static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f42196a = 1.0d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f42197b = new HashMap();

        protected enum a {
            UNDECIDED,
            SHOULD_OVERRIDE,
            DO_NOT_OVERRIDE
        }

        protected d() {
        }

        public synchronized AtomicReference a(Double d10) {
            return (AtomicReference) this.f42197b.get(d10);
        }

        public synchronized N.c b() {
            double d10;
            AtomicReference atomicReference;
            d10 = this.f42196a;
            this.f42196a = 1.0d + d10;
            atomicReference = new AtomicReference(a.UNDECIDED);
            this.f42197b.put(Double.valueOf(d10), atomicReference);
            return new N.c(Double.valueOf(d10), atomicReference);
        }

        public synchronized void c(Double d10) {
            this.f42197b.remove(d10);
        }
    }

    public l(ReactApplicationContext reactApplicationContext) {
        this.f42181a = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean c(String str) {
        if (str.matches("\\.\\w+")) {
            str = m(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(c.IMAGE.f42195a));
    }

    private Boolean d(String[] strArr) {
        String[] strArrI = i(strArr);
        return Boolean.valueOf(g(strArrI, c.DEFAULT.f42195a).booleanValue() || g(strArrI, c.IMAGE.f42195a).booleanValue());
    }

    private Boolean e(String str) {
        if (str.matches("\\.\\w+")) {
            str = m(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(c.VIDEO.f42195a));
    }

    private Boolean f(String[] strArr) {
        String[] strArrI = i(strArr);
        return Boolean.valueOf(g(strArrI, c.DEFAULT.f42195a).booleanValue() || g(strArrI, c.VIDEO.f42195a).booleanValue());
    }

    private Boolean g(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] i(String[] strArr) {
        if (w(strArr).booleanValue()) {
            return new String[]{c.DEFAULT.f42195a};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str.matches("\\.\\w+")) {
                String strM = m(str.replace(".", ""));
                if (strM != null) {
                    strArr2[i10] = strM;
                } else {
                    strArr2[i10] = str;
                }
            } else {
                strArr2[i10] = str;
            }
        }
        return strArr2;
    }

    private Intent k(String str) {
        String strM = str.isEmpty() ? c.DEFAULT.f42195a : str;
        if (str.matches("\\.\\w+")) {
            strM = m(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(strM);
        return intent;
    }

    private Intent l(String[] strArr, boolean z9) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(c.DEFAULT.f42195a);
        intent.putExtra("android.intent.extra.MIME_TYPES", i(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z9);
        return intent;
    }

    private String m(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private D3.f o() {
        ComponentCallbacks2 currentActivity = this.f42181a.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof D3.f) {
            return (D3.f) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    private D3.g s(String str, String str2) {
        return new a(str, str2);
    }

    private Boolean w(String[] strArr) {
        String str;
        boolean z9 = true;
        if (strArr.length != 0 && (strArr.length != 1 || (str = strArr[0]) == null || str.length() != 0)) {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    public boolean A(String[] strArr, boolean z9, ValueCallback valueCallback, boolean z10) {
        Intent intentR;
        this.f42184d = valueCallback;
        Activity currentActivity = this.f42181a.getCurrentActivity();
        ArrayList arrayList = new ArrayList();
        Intent intentP = null;
        if (!v()) {
            if (d(strArr).booleanValue() && (intentP = p()) != null) {
                arrayList.add(intentP);
            }
            if (f(strArr).booleanValue() && (intentR = r()) != null) {
                arrayList.add(intentR);
            }
        }
        Intent intent = new Intent("android.intent.action.CHOOSER");
        if (!z10) {
            intent.putExtra("android.intent.extra.INTENT", l(strArr, z9));
            intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            intentP = intent;
        }
        if (intentP == null) {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "there is no Camera permission");
        } else if (intentP.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(intentP, 1);
        } else {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "there is no Activity to handle this Intent");
        }
        return true;
    }

    public void h(String str) {
        try {
            ((DownloadManager) this.f42181a.getSystemService("download")).enqueue(this.f42182b);
            Toast.makeText(this.f42181a, str, 1).show();
        } catch (IllegalArgumentException | SecurityException e10) {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "Unsupported URI, aborting download", e10);
        }
    }

    public File j(c cVar) {
        String str;
        String str2;
        int i10 = b.f42190a[cVar.ordinal()];
        if (i10 == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (i10 != 2) {
            str = "";
            str2 = "";
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(String.valueOf(System.currentTimeMillis()));
        sb.append(str2);
        return File.createTempFile(str, str2, this.f42181a.getExternalFilesDir(null));
    }

    public Uri n(File file) {
        String packageName = this.f42181a.getPackageName();
        return C.c.h(this.f42181a, packageName + ".fileprovider", file);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        if (this.f42184d == null && this.f42183c == null) {
            return;
        }
        File file = this.f42185e;
        boolean z9 = false;
        boolean z10 = file != null && file.length() > 0;
        File file2 = this.f42186f;
        if (file2 != null && file2.length() > 0) {
            z9 = true;
        }
        if (i10 != 1) {
            if (i10 == 3) {
                if (i11 != -1) {
                    this.f42183c.onReceiveValue(null);
                } else if (z10) {
                    this.f42183c.onReceiveValue(n(this.f42185e));
                } else if (z9) {
                    this.f42183c.onReceiveValue(n(this.f42186f));
                } else {
                    this.f42183c.onReceiveValue(intent.getData());
                }
            }
        } else if (i11 != -1) {
            ValueCallback valueCallback = this.f42184d;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else if (z10) {
            this.f42184d.onReceiveValue(new Uri[]{n(this.f42185e)});
        } else if (z9) {
            this.f42184d.onReceiveValue(new Uri[]{n(this.f42186f)});
        } else {
            this.f42184d.onReceiveValue(q(intent, i11));
        }
        File file3 = this.f42185e;
        if (file3 != null && !z10) {
            file3.delete();
        }
        File file4 = this.f42186f;
        if (file4 != null && !z9) {
            file4.delete();
        }
        this.f42184d = null;
        this.f42183c = null;
        this.f42185e = null;
        this.f42186f = null;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public Intent p() {
        Intent intent;
        Throwable e10;
        try {
            File fileJ = j(c.IMAGE);
            this.f42185e = fileJ;
            Uri uriN = n(fileJ);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            try {
                intent.putExtra("output", uriN);
                return intent;
            } catch (IOException e11) {
                e10 = e11;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e12) {
                e10 = e12;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e13) {
            intent = null;
            e10 = e13;
        }
    }

    public Uri[] q(Intent intent, int i10) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() == null) {
            if (intent.getData() == null || i10 != -1) {
                return null;
            }
            return WebChromeClient.FileChooserParams.parseResult(i10, intent);
        }
        int itemCount = intent.getClipData().getItemCount();
        Uri[] uriArr = new Uri[itemCount];
        for (int i11 = 0; i11 < itemCount; i11++) {
            uriArr[i11] = intent.getClipData().getItemAt(i11).getUri();
        }
        return uriArr;
    }

    public Intent r() {
        Intent intent;
        Throwable e10;
        try {
            File fileJ = j(c.VIDEO);
            this.f42186f = fileJ;
            Uri uriN = n(fileJ);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            try {
                intent.putExtra("output", uriN);
                return intent;
            } catch (IOException e11) {
                e10 = e11;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e12) {
                e10 = e12;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e13) {
            intent = null;
            e10 = e13;
        }
    }

    public boolean t(String str, String str2) {
        Activity currentActivity = this.f42181a.getCurrentActivity();
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        boolean z9 = C.b.a(currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z9) {
            o().e(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, s(str, str2));
        }
        return z9;
    }

    public boolean u() {
        return true;
    }

    protected boolean v() {
        Activity currentActivity = this.f42181a.getCurrentActivity();
        try {
            return Arrays.asList(currentActivity.getPackageManager().getPackageInfo(currentActivity.getApplicationContext().getPackageName(), CodedOutputStream.DEFAULT_BUFFER_SIZE).requestedPermissions).contains("android.permission.CAMERA") && C.b.a(currentActivity, "android.permission.CAMERA") != 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public void x(DownloadManager.Request request) {
        this.f42182b = request;
    }

    public void y(boolean z9, double d10) {
        AtomicReference atomicReferenceA = f42180g.a(Double.valueOf(d10));
        if (atomicReferenceA != null) {
            synchronized (atomicReferenceA) {
                try {
                    atomicReferenceA.set(z9 ? d.a.DO_NOT_OVERRIDE : d.a.SHOULD_OVERRIDE);
                    atomicReferenceA.notify();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void z(String str, ValueCallback valueCallback) {
        Intent intentR;
        Intent intentP;
        this.f42183c = valueCallback;
        Activity currentActivity = this.f42181a.getCurrentActivity();
        Intent intentCreateChooser = Intent.createChooser(k(str), "");
        ArrayList arrayList = new ArrayList();
        if (c(str).booleanValue() && (intentP = p()) != null) {
            arrayList.add(intentP);
        }
        if (e(str).booleanValue() && (intentR = r()) != null) {
            arrayList.add(intentR);
        }
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intentCreateChooser.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(intentCreateChooser, 3);
        } else {
            Log.w(NativeRNCWebViewModuleSpec.NAME, "there is no Activity to handle this Intent");
        }
    }
}
