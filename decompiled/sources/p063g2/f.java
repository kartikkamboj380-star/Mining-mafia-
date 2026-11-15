package p063g2;

import Y1.k;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import p004a3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f44377a = Uri.withAppendedPath((Uri) a.e(ContactsContract.AUTHORITY_URI), "display_photo");

    public static AssetFileDescriptor a(ContentResolver contentResolver, Uri uri) {
        if (k(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    private static String b(boolean z9) {
        return "_data";
    }

    private static Uri c(boolean z9) {
        return z9 ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    private static String d(boolean z9) {
        return "_id";
    }

    public static String e(ContentResolver contentResolver, Uri uri) {
        Uri uri2;
        String str;
        String[] strArr;
        int columnIndexOrThrow;
        String type = contentResolver.getType(uri);
        String string = null;
        if (!k(uri)) {
            if (l(uri)) {
                return uri.getPath();
            }
            return null;
        }
        boolean z9 = type != null && type.startsWith("video/");
        if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri);
            k.g(documentId);
            uri2 = (Uri) k.g(c(z9));
            str = d(z9) + "=?";
            strArr = new String[]{documentId.split(":")[1]};
        } else {
            uri2 = uri;
            str = null;
            strArr = null;
        }
        Cursor cursorQuery = contentResolver.query(uri2, new String[]{b(z9)}, str, strArr, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst() && (columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow(b(z9))) != -1) {
                    string = cursorQuery.getString(columnIndexOrThrow);
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return string;
    }

    public static String f(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static boolean g(Uri uri) {
        return JsonStorageKeyNames.DATA_KEY.equals(f(uri));
    }

    public static boolean h(Uri uri) {
        return "asset".equals(f(uri));
    }

    public static boolean i(Uri uri) {
        String string = uri.toString();
        return string.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || string.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean j(Uri uri) {
        return uri.getPath() != null && k(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith((String) a.e(f44377a.getPath()));
    }

    public static boolean k(Uri uri) {
        return HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(f(uri));
    }

    public static boolean l(Uri uri) {
        return "file".equals(f(uri));
    }

    public static boolean m(Uri uri) {
        return "res".equals(f(uri));
    }

    public static boolean n(Uri uri) {
        String strF = f(uri);
        return HttpRequest.DEFAULT_SCHEME.equals(strF) || "http".equals(strF);
    }

    public static boolean o(Uri uri) {
        return "android.resource".equals(f(uri));
    }

    public static URL p(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }
}
