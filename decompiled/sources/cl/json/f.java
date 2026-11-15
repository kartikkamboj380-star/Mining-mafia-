package cl.json;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f12383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f12384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList f12385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f12386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f12387e;

    public f(ReadableArray readableArray, ArrayList arrayList, String str, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(readableArray, arrayList, bool, reactApplicationContext);
        this.f12386d = str;
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String b(Uri uri) {
        return d.d(this.f12383a, uri, this.f12387e);
    }

    private boolean e(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals(JsonStorageKeyNames.DATA_KEY)) {
            return false;
        }
        String strSubstring = uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";"));
        String str = this.f12386d;
        if (str == null) {
            this.f12386d = strSubstring;
            return true;
        }
        if (!str.equalsIgnoreCase(strSubstring) && this.f12386d.split("/")[0].equalsIgnoreCase(strSubstring.split("/")[0])) {
            this.f12386d = this.f12386d.split("/")[0].concat("/*");
            return true;
        }
        if (this.f12386d.equalsIgnoreCase(strSubstring)) {
            return true;
        }
        this.f12386d = "*/*";
        return true;
    }

    private boolean g(Uri uri) {
        if ((uri.getScheme() == null || !uri.getScheme().equals(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) && !"file".equals(uri.getScheme())) {
            return false;
        }
        String strA = a(uri.toString());
        if (strA == null) {
            strA = a(b(uri));
        }
        if (strA == null) {
            strA = "*/*";
        }
        String str = this.f12386d;
        if (str == null) {
            this.f12386d = strA;
            return true;
        }
        if (!str.equalsIgnoreCase(strA) && this.f12386d.split("/")[0].equalsIgnoreCase(strA.split("/")[0])) {
            this.f12386d = this.f12386d.split("/")[0].concat("/*");
            return true;
        }
        if (this.f12386d.equalsIgnoreCase(strA)) {
            return true;
        }
        this.f12386d = "*/*";
        return true;
    }

    public String c() {
        String str = this.f12386d;
        return str == null ? "*/*" : str;
    }

    public ArrayList d() {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f12384b.size(); i10++) {
            Uri uri = (Uri) this.f12384b.get(i10);
            if (e(uri)) {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";")));
                String strSubstring = uri.getSchemeSpecificPart().substring(uri.getSchemeSpecificPart().indexOf(";base64,") + 8);
                String str = this.f12385c.size() >= i10 + 1 ? (String) this.f12385c.get(i10) : System.currentTimeMillis() + "." + extensionFromMimeType;
                try {
                    File file = new File(this.f12387e.booleanValue() ? this.f12383a.getCacheDir() : this.f12383a.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                    if (!file.exists() && !file.mkdirs()) {
                        throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                    }
                    File file2 = new File(file, str);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(Base64.decode(strSubstring, 0));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    arrayList.add(d.a(this.f12383a, file2));
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } else if (g(uri) && uri.getPath() != null) {
                if (this.f12385c.size() >= i10 + 1) {
                    arrayList.add(d.a(this.f12383a, new File(uri.getPath(), (String) this.f12385c.get(i10))));
                } else {
                    arrayList.add(d.a(this.f12383a, new File(uri.getPath())));
                }
            }
        }
        return arrayList;
    }

    public boolean f() {
        ArrayList arrayList = this.f12384b;
        int size = arrayList.size();
        boolean z9 = true;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Uri uri = (Uri) obj;
            z9 = e(uri) || g(uri);
            if (!z9) {
                break;
            }
        }
        return z9;
    }

    public f(ReadableArray readableArray, ArrayList arrayList, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f12384b = new ArrayList();
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            String string = readableArray.getString(i10);
            if (string != null) {
                this.f12384b.add(Uri.parse(string));
            }
        }
        this.f12385c = arrayList;
        this.f12387e = bool;
        this.f12383a = reactApplicationContext;
    }
}
