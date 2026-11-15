package com.bytedance.sdk.component.oq.kq.kq.kq;

import android.text.TextUtils;
import com.bytedance.sdk.component.oq.kq.suf;
import com.bytedance.sdk.component.oq.kq.ubx;
import com.bytedance.sdk.component.oq.kq.vvw;
import com.bytedance.sdk.component.oq.kq.wki;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class oq implements com.bytedance.sdk.component.oq.kq.oq {
    private static List<Object> fou;
    private AtomicBoolean bob = new AtomicBoolean(false);
    vvw kq;
    com.bytedance.sdk.component.oq.kq.fou oq;

    static {
        try {
            fou = new ArrayList();
            Class<?> cls = Class.forName("com.android.okhttp.Protocol");
            Enum enumValueOf = Enum.valueOf(cls, "HTTP_1_1");
            if (enumValueOf != null) {
                fou.add(enumValueOf);
            }
            Enum enumValueOf2 = Enum.valueOf(cls, "HTTP_2");
            if (enumValueOf2 != null) {
                fou.add(enumValueOf2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    oq(vvw vvwVar, com.bytedance.sdk.component.oq.kq.fou fouVar) {
        this.kq = vvwVar;
        this.oq = fouVar;
    }

    private boolean csi() {
        if (this.kq.fou() == null) {
            return false;
        }
        return this.kq.fou().containsKey(CommonGatewayClient.HEADER_CONTENT_TYPE);
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq
    public void bob() {
        this.bob.set(true);
    }

    /* JADX INFO: renamed from: fou, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.oq.kq.oq clone() {
        return new oq(this.kq, this.oq);
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq
    public vvw kq() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq
    public suf oq() throws IOException {
        List<com.bytedance.sdk.component.oq.kq.syt> list;
        com.bytedance.sdk.component.bob.kq.kq kqVar;
        vvw vvwVar = this.kq;
        if (vvwVar != null && (kqVar = vvwVar.oq) != null) {
            if (kqVar.suf() == 0) {
                this.kq.oq.nze();
            }
            this.kq.oq.kq();
        }
        this.oq.bob().remove(this);
        this.oq.fou().add(this);
        com.bytedance.sdk.component.oq.kq.fou fouVar = this.oq;
        if ((fouVar instanceof rhi) && (fouVar.bob().size() + this.oq.fou().size() > this.oq.kq() || this.bob.get())) {
            this.oq.fou().remove(this);
            return new syt(syt.kq, "Maximum number of requests exceeded", this.kq);
        }
        try {
            ubx ubxVar = this.kq.kq;
            if (ubxVar == null || (list = ubxVar.kq) == null || list.size() <= 0) {
                return kq(this.kq);
            }
            ArrayList arrayList = new ArrayList(this.kq.kq.kq);
            arrayList.add(new com.bytedance.sdk.component.oq.kq.syt() { // from class: com.bytedance.sdk.component.oq.kq.kq.kq.oq.1
                @Override // com.bytedance.sdk.component.oq.kq.syt
                public suf kq(com.bytedance.sdk.component.oq.kq.syt.kq kqVar2) {
                    return oq.this.kq(kqVar2.kq());
                }
            });
            return ((com.bytedance.sdk.component.oq.kq.syt) arrayList.get(0)).kq(new bob(arrayList, this.kq));
        } catch (Throwable th) {
            throw new IOException(th.getMessage());
        }
    }

    private boolean kq(wki wkiVar) {
        vvw vvwVar;
        byte[] bArr;
        return wkiVar != null && (vvwVar = this.kq) != null && "POST".equalsIgnoreCase(vvwVar.bob()) && wkiVar.rhi == wki.kq.BYTE_ARRAY_TYPE && (bArr = wkiVar.csi) != null && bArr.length > 0;
    }

    public suf kq(vvw vvwVar) {
        return kq(vvwVar, com.bytedance.sdk.component.rjo.kq.csi());
    }

    public suf kq(vvw vvwVar, boolean z9) {
        HttpURLConnection httpURLConnection;
        IOException e10;
        String strKq;
        int responseCode = syt.kq;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(vvwVar.oq().kq().toString()).openConnection()));
                if (z9) {
                    try {
                        if (!"setting".equals(vvwVar.rhi()) && !"gecko".equals(vvwVar.rhi()) && !"load_ug_t".equals(vvwVar.rhi())) {
                            kq(httpURLConnection);
                        }
                    } catch (IOException e11) {
                        e10 = e11;
                        if (responseCode == -1 && z9) {
                            suf sufVarKq = kq(vvwVar, false);
                            this.oq.fou().remove(this);
                            return sufVarKq;
                        }
                        strKq = kq(httpURLConnection, e10);
                        this.oq.fou().remove(this);
                    } catch (Exception e12) {
                        e = e12;
                        httpURLConnection2 = httpURLConnection;
                        strKq = kq(httpURLConnection2, e);
                        this.oq.fou().remove(this);
                    }
                }
                if (vvwVar.fou() != null && vvwVar.fou().size() > 0) {
                    for (Map.Entry<String, List<String>> entry : vvwVar.fou().entrySet()) {
                        String key = entry.getKey();
                        for (String str : entry.getValue()) {
                            if ("_disable_retry".equals(key) && UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(str)) {
                                oq(httpURLConnection);
                            } else {
                                httpURLConnection.addRequestProperty(key, str);
                            }
                        }
                    }
                }
                ubx ubxVar = vvwVar.kq;
                if (ubxVar != null) {
                    TimeUnit timeUnit = ubxVar.bob;
                    if (timeUnit != null) {
                        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(ubxVar.oq));
                    }
                    ubx ubxVar2 = vvwVar.kq;
                    if (ubxVar2.bob != null) {
                        httpURLConnection.setReadTimeout((int) ubxVar2.csi.toMillis(ubxVar2.fou));
                    }
                }
                if (vvwVar.syt() == null) {
                    httpURLConnection.setRequestMethod("GET");
                } else {
                    if (!csi() && vvwVar.syt().bob != null) {
                        httpURLConnection.addRequestProperty(CommonGatewayClient.HEADER_CONTENT_TYPE, vvwVar.syt().bob.kq());
                    }
                    httpURLConnection.setRequestMethod(vvwVar.bob());
                    if ("POST".equalsIgnoreCase(vvwVar.bob())) {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        if (kq(vvwVar.syt())) {
                            outputStream.write(vvwVar.syt().csi);
                        } else if (oq(vvwVar.syt())) {
                            outputStream.write(vvwVar.syt().fou.getBytes());
                        }
                        outputStream.flush();
                        outputStream.close();
                    }
                }
                com.bytedance.sdk.component.bob.kq.kq kqVar = vvwVar.oq;
                if (kqVar != null) {
                    kqVar.oq();
                }
                httpURLConnection.connect();
                com.bytedance.sdk.component.bob.kq.kq kqVar2 = vvwVar.oq;
                if (kqVar2 != null) {
                    kqVar2.bob();
                }
                responseCode = httpURLConnection.getResponseCode();
                com.bytedance.sdk.component.bob.kq.kq kqVar3 = vvwVar.oq;
                if (kqVar3 != null) {
                    kqVar3.csi();
                }
                if (this.bob.get()) {
                    httpURLConnection.disconnect();
                    this.oq.fou().remove(this);
                    strKq = "internal error";
                    return new syt(responseCode, strKq, vvwVar);
                }
                syt sytVar = new syt(httpURLConnection, vvwVar);
                this.oq.fou().remove(this);
                return sytVar;
            } catch (Throwable th) {
                this.oq.fou().remove(this);
                throw th;
            }
        } catch (IOException e13) {
            httpURLConnection = null;
            e10 = e13;
        } catch (Exception e14) {
            e = e14;
        }
    }

    private boolean oq(wki wkiVar) {
        vvw vvwVar;
        return (wkiVar == null || (vvwVar = this.kq) == null || !"POST".equalsIgnoreCase(vvwVar.bob()) || wkiVar.rhi != wki.kq.STRING_TYPE || TextUtils.isEmpty(wkiVar.fou)) ? false : true;
    }

    private static void oq(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    private static String kq(HttpURLConnection httpURLConnection, Exception exc) {
        try {
            return httpURLConnection.getErrorStream().toString();
        } catch (Throwable unused) {
            return exc.getMessage();
        }
    }

    private static void kq(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (fou.size() == 2) {
                obj2.getClass().getDeclaredMethod("setProtocols", List.class).invoke(obj2, fou);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.component.oq.kq.oq
    public void kq(final com.bytedance.sdk.component.oq.kq.bob bobVar) {
        com.bytedance.sdk.component.bob.kq.kq kqVar;
        vvw vvwVar = this.kq;
        if (vvwVar != null && (kqVar = vvwVar.oq) != null) {
            kqVar.nze();
        }
        this.oq.oq().submit(new com.bytedance.sdk.component.syt.bob.oq(this.kq.rjo(), this.kq.rhi()) { // from class: com.bytedance.sdk.component.oq.kq.kq.kq.oq.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    suf sufVarOq = oq.this.oq();
                    if (sufVarOq == null) {
                        bobVar.kq(oq.this, new IOException("response is null"));
                    } else {
                        bobVar.kq(oq.this, sufVarOq);
                    }
                } catch (IOException e10) {
                    bobVar.kq(oq.this, e10);
                }
            }
        });
    }
}
