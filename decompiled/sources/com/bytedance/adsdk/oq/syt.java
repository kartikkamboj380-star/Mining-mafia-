package com.bytedance.adsdk.oq;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.oq.csi.uml;
import com.google.protobuf.CodedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class syt {
    private static final Map<String, wki<rjo>> kq = new HashMap();
    private static final Set<Object> oq = new HashSet();
    private static final byte[] bob = {80, 75, 3, 4};

    public static vvw<rjo> bob(Context context, String str) {
        return bob(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static wki<rjo> oq(Context context, String str) {
        return oq(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static vvw<rjo> bob(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return oq(context.getAssets().open(str), str2);
            }
            return kq(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new vvw<>((Throwable) e10);
        }
    }

    public static wki<rjo> kq(Context context, String str) {
        return kq(context, str, "url_".concat(String.valueOf(str)));
    }

    public static wki<rjo> oq(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return kq(str2, new Callable<vvw<rjo>>() { // from class: com.bytedance.adsdk.oq.syt.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public vvw<rjo> call() {
                return syt.bob(applicationContext, str, str2);
            }
        });
    }

    public static wki<rjo> kq(final Context context, final String str, final String str2) {
        return kq(str2, new Callable<vvw<rjo>>() { // from class: com.bytedance.adsdk.oq.syt.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public vvw<rjo> call() {
                vvw<rjo> vvwVarKq = csi.kq(context).kq(context, str, str2);
                if (str2 != null && vvwVarKq.kq() != null) {
                    com.bytedance.adsdk.oq.bob.csi.kq().kq(str2, vvwVarKq.kq());
                }
                return vvwVarKq;
            }
        });
    }

    public static wki<rjo> kq(Context context, int i10) {
        return kq(context, i10, bob(context, i10));
    }

    public static vvw<rjo> oq(Context context, int i10) {
        return oq(context, i10, bob(context, i10));
    }

    public static wki<rjo> kq(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return kq(str, new Callable<vvw<rjo>>() { // from class: com.bytedance.adsdk.oq.syt.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public vvw<rjo> call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return syt.oq(context2, i10, str);
            }
        });
    }

    public static vvw<rjo> oq(Context context, int i10, String str) {
        try {
            return oq(context.getResources().openRawResource(i10), bob(context, i10));
        } catch (Resources.NotFoundException e10) {
            return new vvw<>((Throwable) e10);
        }
    }

    private static String bob(Context context, int i10) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(kq(context) ? "_night_" : "_day_");
        sb.append(i10);
        return sb.toString();
    }

    public static vvw<rjo> oq(InputStream inputStream, String str) {
        return kq(inputStream, str, true);
    }

    private static boolean kq(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static vvw<rjo> oq(Context context, ZipInputStream zipInputStream, String str) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            rjo rjoVarKq = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    rjoVarKq = kq(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).kq();
                } else if (!name.endsWith(".png") && !name.endsWith(".webp") && !name.endsWith(".jpg") && !name.endsWith(".jpeg")) {
                    if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                        zipInputStream.closeEntry();
                    } else if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] strArrSplit = name.split("/");
                        String str2 = strArrSplit[strArrSplit.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
                                while (true) {
                                    int i10 = zipInputStream.read(bArr);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i10);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th3) {
                                        th.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            file.getAbsolutePath();
                        }
                        map2.put(str3, typefaceCreateFromFile);
                    }
                } else if (name.contains("../")) {
                    zipInputStream.closeEntry();
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    String[] strArrSplit2 = name.split("/");
                    map.put(strArrSplit2[strArrSplit2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (rjoVarKq == null) {
                return new vvw<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                nn nnVarKq = kq(rjoVarKq, (String) entry.getKey());
                if (nnVarKq != null) {
                    nnVarKq.kq(com.bytedance.adsdk.oq.rhi.rhi.kq((Bitmap) entry.getValue(), nnVarKq.kq(), nnVarKq.oq()));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z9 = false;
                for (com.bytedance.adsdk.oq.bob.bob bobVar : rjoVarKq.nze().values()) {
                    if (bobVar.kq().equals(entry2.getKey())) {
                        bobVar.kq((Typeface) entry2.getValue());
                        z9 = true;
                    }
                }
                if (!z9) {
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, nn>> it = rjoVarKq.mxq().entrySet().iterator();
                while (it.hasNext()) {
                    nn value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String strDgq = value.dgq();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (strDgq.startsWith("data:") && strDgq.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(strDgq.substring(strDgq.indexOf(44) + 1), 0);
                            value.kq(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, nn> entry3 : rjoVarKq.mxq().entrySet()) {
                if (entry3.getValue().ubx() == null) {
                    return new vvw<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().dgq()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.oq.bob.csi.kq().kq(str, rjoVarKq);
            }
            return new vvw<>(rjoVarKq);
        } catch (IOException e10) {
            return new vvw<>((Throwable) e10);
        }
    }

    public static wki<rjo> kq(final InputStream inputStream, final String str) {
        return kq(str, new Callable<vvw<rjo>>() { // from class: com.bytedance.adsdk.oq.syt.6
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
            public vvw<rjo> call() {
                return syt.oq(inputStream, str);
            }
        });
    }

    private static vvw<rjo> kq(InputStream inputStream, String str, boolean z9) {
        try {
            return kq(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z9) {
                com.bytedance.adsdk.oq.rhi.rhi.kq(inputStream);
            }
        }
    }

    public static vvw<rjo> kq(JsonReader jsonReader, String str) {
        return kq(jsonReader, str, true);
    }

    private static vvw<rjo> kq(JsonReader jsonReader, String str, boolean z9) {
        try {
            rjo rjoVarKq = uml.kq(jsonReader);
            com.bytedance.adsdk.oq.bob.csi.kq().kq(str, rjoVarKq);
            return new vvw<>(rjoVarKq);
        } catch (Exception e10) {
            return new vvw<>((Throwable) e10);
        } finally {
            if (z9) {
                kq(jsonReader);
            }
        }
    }

    public static void kq(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static vvw<rjo> kq(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return oq(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.oq.rhi.rhi.kq(zipInputStream);
        }
    }

    private static nn kq(rjo rjoVar, String str) {
        for (nn nnVar : rjoVar.mxq().values()) {
            if (nnVar.dgq().equals(str)) {
                return nnVar;
            }
        }
        return null;
    }

    private static wki<rjo> kq(final String str, Callable<vvw<rjo>> callable) {
        final rjo rjoVarKq = str == null ? null : com.bytedance.adsdk.oq.bob.csi.kq().kq(str);
        if (rjoVarKq != null) {
            return new wki<>(new Callable<vvw<rjo>>() { // from class: com.bytedance.adsdk.oq.syt.7
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
                public vvw<rjo> call() {
                    return new vvw<>(rjoVarKq);
                }
            });
        }
        if (str != null) {
            Map<String, wki<rjo>> map = kq;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        wki<rjo> wkiVar = new wki<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            wkiVar.kq(new ubx<rjo>() { // from class: com.bytedance.adsdk.oq.syt.2
                @Override // com.bytedance.adsdk.oq.ubx
                public void kq(rjo rjoVar) {
                    syt.kq.remove(str);
                    atomicBoolean.set(true);
                    if (syt.kq.size() == 0) {
                        syt.oq(true);
                    }
                }
            });
            wkiVar.bob(new ubx<Throwable>() { // from class: com.bytedance.adsdk.oq.syt.3
                @Override // com.bytedance.adsdk.oq.ubx
                public void kq(Throwable th) {
                    syt.kq.remove(str);
                    atomicBoolean.set(true);
                    if (syt.kq.size() == 0) {
                        syt.oq(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, wki<rjo>> map2 = kq;
                map2.put(str, wkiVar);
                if (map2.size() == 1) {
                    oq(false);
                }
            }
        }
        return wkiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oq(boolean z9) {
        ArrayList arrayList = new ArrayList(oq);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10);
        }
    }
}
