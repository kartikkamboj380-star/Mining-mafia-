package com.bytedance.sdk.component.rjo.oq;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.oq.kq.nze;
import com.bytedance.sdk.component.oq.kq.rhi;
import com.bytedance.sdk.component.oq.kq.rjo;
import com.bytedance.sdk.component.oq.kq.suf;
import com.bytedance.sdk.component.oq.kq.ubx;
import com.bytedance.sdk.component.oq.kq.vvw;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class oq extends bob {
    public static final com.bytedance.sdk.component.oq.kq.kq kq = new com.bytedance.sdk.component.oq.kq.kq.C0249kq().kq().oq();
    public static final com.bytedance.sdk.component.oq.kq.kq oq = new com.bytedance.sdk.component.oq.kq.kq.C0249kq().oq();
    private com.bytedance.sdk.component.oq.kq.kq nn;
    private boolean ubx;
    private Map<String, String> vvw;

    public oq(ubx ubxVar) {
        super(ubxVar);
        this.nn = kq;
        this.ubx = false;
        this.vvw = new HashMap();
    }

    public void kq(boolean z9) {
        this.ubx = z9;
    }

    public void kq(final com.bytedance.sdk.component.rjo.kq.kq kqVar) {
        try {
            vvw.kq kqVar2 = new vvw.kq();
            if (this.ubx) {
                kqVar2.oq(this.syt);
            } else {
                rjo.kq kqVar3 = new rjo.kq();
                Uri uri = Uri.parse(this.syt);
                kqVar3.kq(uri.getScheme());
                kqVar3.oq(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    kqVar3.bob(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.vvw.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.vvw.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        kqVar3.kq(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                kqVar2.kq(kqVar3.oq());
            }
            kq(kqVar2);
            kqVar2.kq(this.nn);
            kqVar2.kq((Object) bob());
            if (!TextUtils.isEmpty(this.csi)) {
                kqVar2.kq(this.csi);
            }
            int i10 = this.rhi;
            if (i10 > 0) {
                kqVar2.kq(i10);
            }
            this.bob.kq(kqVar2.kq().oq()).kq(new com.bytedance.sdk.component.oq.kq.bob() { // from class: com.bytedance.sdk.component.rjo.oq.oq.1
                @Override // com.bytedance.sdk.component.oq.kq.bob
                public void kq(com.bytedance.sdk.component.oq.kq.oq oqVar, IOException iOException) {
                    com.bytedance.sdk.component.rjo.kq.kq kqVar4 = kqVar;
                    if (kqVar4 != null) {
                        kqVar4.kq(oq.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.oq.kq.bob
                public void kq(com.bytedance.sdk.component.oq.kq.oq oqVar, suf sufVar) {
                    String strOq;
                    if (kqVar != null) {
                        HashMap map = new HashMap();
                        if (sufVar != null) {
                            rhi rhiVarRjo = sufVar.rjo();
                            if (rhiVarRjo != null) {
                                for (int i11 = 0; i11 < rhiVarRjo.kq(); i11++) {
                                    map.put(rhiVarRjo.kq(i11), rhiVarRjo.oq(i11));
                                }
                            }
                            nze nzeVarRhi = sufVar.rhi();
                            if (nzeVarRhi == null) {
                                strOq = "";
                            } else {
                                strOq = nzeVarRhi.oq();
                            }
                            kqVar.kq(oq.this, new com.bytedance.sdk.component.rjo.oq(sufVar.fou(), sufVar.bob(), sufVar.csi(), map, strOq, sufVar.oq(), sufVar.kq()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            if (kqVar != null) {
                kqVar.kq(this, new IOException(th.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.rjo.oq kq() {
        try {
            vvw.kq kqVar = new vvw.kq();
            if (this.ubx) {
                kqVar.oq(this.syt);
            } else {
                rjo.kq kqVar2 = new rjo.kq();
                Uri uri = Uri.parse(this.syt);
                kqVar2.kq(uri.getScheme());
                kqVar2.oq(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    kqVar2.bob(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.vvw.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.vvw.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        kqVar2.kq(strEncode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                kqVar.kq(kqVar2.oq());
            }
            kq(kqVar);
            kqVar.kq(this.nn);
            kqVar.kq((Object) bob());
            suf sufVarOq = this.bob.kq(kqVar.kq().oq()).oq();
            if (sufVarOq == null) {
                return null;
            }
            HashMap map = new HashMap();
            rhi rhiVarRjo = sufVarOq.rjo();
            if (rhiVarRjo != null) {
                for (int i10 = 0; i10 < rhiVarRjo.kq(); i10++) {
                    map.put(rhiVarRjo.kq(i10), rhiVarRjo.oq(i10));
                }
            }
            nze nzeVarRhi = sufVarOq.rhi();
            return new com.bytedance.sdk.component.rjo.oq(sufVarOq.fou(), sufVarOq.bob(), sufVarOq.csi(), map, nzeVarRhi != null ? nzeVarRhi.oq() : "", sufVarOq.oq(), sufVarOq.kq());
        } catch (Throwable unused) {
            return null;
        }
    }
}
