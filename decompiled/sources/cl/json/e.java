package cl.json;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f12377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f12378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f12379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f12380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f12381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f12382f;

    public e(String str, String str2, String str3, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(str, str3, bool, reactApplicationContext);
        this.f12380d = str2;
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String b(Uri uri) {
        return d.d(this.f12377a, uri, this.f12382f);
    }

    private boolean e() {
        if (this.f12379c.getScheme() == null || !this.f12379c.getScheme().equals(JsonStorageKeyNames.DATA_KEY)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (char c10 : this.f12379c.toString().substring(5).toCharArray()) {
            if (c10 == ';') {
                break;
            }
            sb.append(c10);
        }
        this.f12380d = sb.toString();
        return true;
    }

    private boolean g() {
        if (this.f12379c.getScheme() == null || !(this.f12379c.getScheme().equals(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT) || this.f12379c.getScheme().equals("file"))) {
            return false;
        }
        if (this.f12380d != null) {
            return true;
        }
        String strA = a(this.f12379c.toString());
        this.f12380d = strA;
        if (strA == null) {
            String strB = b(this.f12379c);
            if (strB == null) {
                return false;
            }
            this.f12380d = a(strB);
        }
        if (this.f12380d == null) {
            this.f12380d = "*/*";
        }
        return true;
    }

    public String c() {
        String str = this.f12380d;
        return str == null ? "*/*" : str;
    }

    public Uri d() {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(c());
        if (e()) {
            String strSubstring = this.f12379c.toString().substring(this.f12380d.length() + 13);
            String str = this.f12381e;
            if (str == null) {
                str = System.nanoTime() + "";
            }
            try {
                File file = new File(this.f12382f.booleanValue() ? this.f12377a.getCacheDir() : this.f12377a.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                }
                File file2 = new File(file, str + "." + extensionFromMimeType);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(Base64.decode(strSubstring, 0));
                fileOutputStream.flush();
                fileOutputStream.close();
                return d.a(this.f12377a, file2);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } else if (g()) {
            Uri uri = Uri.parse(this.f12378b);
            if (uri.getPath() == null) {
                return null;
            }
            return d.a(this.f12377a, new File(uri.getPath()));
        }
        return null;
    }

    public boolean f() {
        return e() || g();
    }

    public e(String str, String str2, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f12378b = str;
        this.f12379c = Uri.parse(str);
        this.f12381e = str2;
        this.f12382f = bool;
        this.f12377a = reactApplicationContext;
    }
}
