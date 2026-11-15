package L;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator f2996a = new Comparator() { // from class: L.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.a((byte[]) obj, (byte[]) obj2);
        }
    };

    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    private static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f2997a;

        b(Context context, Uri uri) {
            this.f2997a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // L.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f2997a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // L.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f2997a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    private static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : E.e.c(resources, eVar.c());
    }

    static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoF = f(context.getPackageManager(), eVar, context.getResources());
        return providerInfoF == null ? g.a.a(1, null) : g.a.a(0, g(context, eVar, providerInfoF.authority, cancellationSignal));
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) throws PackageManager.NameNotFoundException {
        String strE = eVar.e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(eVar.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + eVar.f());
        }
        List listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listB, f2996a);
        List listD = d(eVar, resources);
        for (int i10 = 0; i10 < listD.size(); i10++) {
            ArrayList arrayList = new ArrayList((Collection) listD.get(i10));
            Collections.sort(arrayList, f2996a);
            if (c(listB, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    static g.b[] g(Context context, e eVar, String str, CancellationSignal cancellationSignal) throws Throwable {
        a aVar;
        a aVar2;
        Uri uriWithAppendedId;
        boolean z9;
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(str).appendPath("file").build();
        a aVarA = a.a(context, uriBuild);
        Cursor cursorB = null;
        try {
            cursorB = aVarA.b(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
            if (cursorB == null || cursorB.getCount() <= 0) {
                aVar2 = aVarA;
            } else {
                int columnIndex = cursorB.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorB.getColumnIndex("_id");
                int columnIndex3 = cursorB.getColumnIndex("file_id");
                int columnIndex4 = cursorB.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorB.getColumnIndex("font_weight");
                int columnIndex6 = cursorB.getColumnIndex("font_italic");
                while (cursorB.moveToNext()) {
                    int i10 = columnIndex != -1 ? cursorB.getInt(columnIndex) : 0;
                    int i11 = columnIndex4 != -1 ? cursorB.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        aVar = aVarA;
                        try {
                            uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorB.getLong(columnIndex2));
                        } catch (Throwable th) {
                            th = th;
                            if (cursorB != null) {
                                cursorB.close();
                            }
                            aVar.close();
                            throw th;
                        }
                    } else {
                        aVar = aVarA;
                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorB.getLong(columnIndex3));
                    }
                    int i12 = columnIndex5 != -1 ? cursorB.getInt(columnIndex5) : CommonGatewayClient.CODE_400;
                    if (columnIndex6 != -1) {
                        z9 = true;
                        if (cursorB.getInt(columnIndex6) != 1) {
                            z9 = false;
                        }
                    } else {
                        z9 = false;
                    }
                    arrayList2.add(g.b.a(uriWithAppendedId, i11, i12, z9, i10));
                    aVarA = aVar;
                }
                aVar2 = aVarA;
                arrayList = arrayList2;
            }
            if (cursorB != null) {
                cursorB.close();
            }
            aVar2.close();
            return (g.b[]) arrayList.toArray(new g.b[0]);
        } catch (Throwable th2) {
            th = th2;
            aVar = aVarA;
        }
    }
}
