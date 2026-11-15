package com.bytedance.sdk.component.rjo.oq;

import android.text.TextUtils;
import com.bytedance.sdk.component.oq.kq.dgq;
import com.bytedance.sdk.component.oq.kq.nze;
import com.bytedance.sdk.component.oq.kq.rhi;
import com.bytedance.sdk.component.oq.kq.suf;
import com.bytedance.sdk.component.oq.kq.ubx;
import com.bytedance.sdk.component.oq.kq.vvw;
import com.bytedance.sdk.component.oq.kq.wki;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class fou extends bob {
    wki kq;

    public fou(ubx ubxVar) {
        super(ubxVar);
        this.kq = null;
    }

    private byte[] csi(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream2.write(str.getBytes("utf-8"));
                        try {
                            gZIPOutputStream2.close();
                        } catch (IOException unused) {
                        }
                    } catch (IOException unused2) {
                        gZIPOutputStream = gZIPOutputStream2;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (byteArrayOutputStream != null) {
                        }
                        return byteArray;
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        if (gZIPOutputStream != null) {
                            try {
                                gZIPOutputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (byteArrayOutputStream == null) {
                            throw th;
                        }
                        byteArrayOutputStream.toByteArray();
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException unused5) {
                            throw th;
                        }
                    }
                } catch (IOException unused6) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused7) {
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
            byteArrayOutputStream.close();
        } catch (IOException unused8) {
        }
        byteArray = byteArrayOutputStream.toByteArray();
        return byteArray;
    }

    public void fou(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        this.kq = wki.kq(dgq.kq("application/json; charset=utf-8"), str);
    }

    public void kq(JSONObject jSONObject) {
        String string;
        if (jSONObject != null) {
            string = jSONObject.toString();
        } else {
            string = "{}";
        }
        this.kq = wki.kq(dgq.kq("application/json; charset=utf-8"), string);
    }

    public void kq(String str, byte[] bArr) {
        this.kq = wki.kq(dgq.kq(str), bArr);
    }

    public void kq(final com.bytedance.sdk.component.rjo.kq.kq kqVar) {
        try {
            vvw.kq kqVar2 = new vvw.kq();
            if (TextUtils.isEmpty(this.syt)) {
                kqVar.kq(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.csi)) {
                kqVar2.kq(this.csi);
            }
            int i10 = this.rhi;
            if (i10 > 0) {
                kqVar2.kq(i10);
            }
            kqVar2.oq(this.syt);
            if (this.kq == null) {
                if (kqVar != null) {
                    kqVar.kq(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                kq(kqVar2);
                kqVar2.kq((Object) bob());
                this.bob.kq(kqVar2.kq(this.kq).oq()).kq(new com.bytedance.sdk.component.oq.kq.bob() { // from class: com.bytedance.sdk.component.rjo.oq.fou.1
                    @Override // com.bytedance.sdk.component.oq.kq.bob
                    public void kq(com.bytedance.sdk.component.oq.kq.oq oqVar, IOException iOException) {
                        com.bytedance.sdk.component.rjo.kq.kq kqVar3 = kqVar;
                        if (kqVar3 != null) {
                            kqVar3.kq(fou.this, iOException);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.sdk.component.oq.kq.rhi] */
                    /* JADX WARN: Type inference failed for: r13v6, types: [com.bytedance.sdk.component.rjo.kq.kq] */
                    /* JADX WARN: Type inference failed for: r1v0 */
                    /* JADX WARN: Type inference failed for: r1v1 */
                    /* JADX WARN: Type inference failed for: r1v8 */
                    /* JADX WARN: Type inference failed for: r2v0 */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.bytedance.sdk.component.rjo.oq] */
                    /* JADX WARN: Type inference failed for: r2v11 */
                    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v14 */
                    /* JADX WARN: Type inference failed for: r2v15 */
                    /* JADX WARN: Type inference failed for: r2v16 */
                    /* JADX WARN: Type inference failed for: r2v17 */
                    /* JADX WARN: Type inference failed for: r2v18 */
                    /* JADX WARN: Type inference failed for: r2v5 */
                    /* JADX WARN: Type inference failed for: r2v9, types: [com.bytedance.sdk.component.rjo.oq] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.bytedance.sdk.component.oq.kq.bob
                    public void kq(com.bytedance.sdk.component.oq.kq.oq oqVar, suf sufVar) {
                        Throwable th;
                        ?? r10;
                        ?? oqVar2;
                        com.bytedance.sdk.component.rjo.kq.kq kqVar3 = kqVar;
                        if (kqVar3 != null) {
                            if (sufVar == null) {
                                kqVar3.kq(fou.this, new IOException("No response"));
                                return;
                            }
                            ?? r11 = 0;
                            IOException iOException = null;
                            try {
                                HashMap map = new HashMap();
                                ?? Rjo = sufVar.rjo();
                                if (Rjo != 0) {
                                    oqVar2 = 0;
                                    while (oqVar2 < Rjo.kq()) {
                                        String strKq = Rjo.kq(oqVar2);
                                        String strOq = Rjo.oq(oqVar2);
                                        map.put(strKq, strOq);
                                        if (strKq != null && strKq.equalsIgnoreCase("content-type")) {
                                            map.put("content-type", strOq == null ? "" : strOq.toLowerCase());
                                        }
                                        oqVar2++;
                                    }
                                }
                                nze nzeVarRhi = sufVar.rhi();
                                try {
                                    if (com.bytedance.sdk.component.rjo.bob.kq.kq(map)) {
                                        byte[] bArrFou = nzeVarRhi.fou();
                                        com.bytedance.sdk.component.rjo.oq oqVar3 = new com.bytedance.sdk.component.rjo.oq(sufVar.fou(), sufVar.bob(), sufVar.csi(), map, null, sufVar.oq(), sufVar.kq());
                                        oqVar3.kq(bArrFou);
                                        oqVar2 = oqVar3;
                                    } else if (fou.this.dgq) {
                                        byte[] bArrFou2 = nzeVarRhi.fou();
                                        fou fouVar = fou.this;
                                        com.bytedance.sdk.component.rjo.oq oqVar4 = new com.bytedance.sdk.component.rjo.oq(sufVar.fou(), sufVar.bob(), sufVar.csi(), map, new String(bArrFou2, fouVar.kq(fouVar.kq(nzeVarRhi))), sufVar.oq(), sufVar.kq());
                                        oqVar4.kq(bArrFou2);
                                        oqVar2 = oqVar4;
                                    } else if (nzeVarRhi != null) {
                                        oqVar2 = new com.bytedance.sdk.component.rjo.oq(sufVar.fou(), sufVar.bob(), sufVar.csi(), map, nzeVarRhi.oq(), sufVar.oq(), sufVar.kq());
                                    } else {
                                        throw new IOException(sufVar.csi());
                                    }
                                    fou.this.kq((com.bytedance.sdk.component.rjo.oq) oqVar2, sufVar);
                                    r10 = oqVar2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r11 = oqVar2;
                                    r10 = r11;
                                    iOException = new IOException(th);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            if (r10 != 0) {
                                kqVar.kq(fou.this, r10);
                                return;
                            }
                            com.bytedance.sdk.component.rjo.kq.kq kqVar4 = kqVar;
                            if (kqVar4 instanceof com.bytedance.sdk.component.rjo.kq.oq) {
                                com.bytedance.sdk.component.rjo.kq.oq oqVar5 = (com.bytedance.sdk.component.rjo.kq.oq) kqVar4;
                                fou fouVar2 = fou.this;
                                if (iOException == null) {
                                    iOException = new IOException("Unexpected exception");
                                }
                                oqVar5.kq(fouVar2, iOException, new com.bytedance.sdk.component.rjo.oq(sufVar.fou(), sufVar.bob(), sufVar.csi(), null, null, sufVar.oq(), sufVar.kq()));
                                return;
                            }
                            fou fouVar3 = fou.this;
                            if (iOException == null) {
                                iOException = new IOException("Unexpected exception");
                            }
                            kqVar4.kq(fouVar3, iOException);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            kqVar.kq(this, new IOException(th.getMessage()));
        }
    }

    public com.bytedance.sdk.component.rjo.oq kq() {
        com.bytedance.sdk.component.rjo.oq oqVar;
        try {
            vvw.kq kqVar = new vvw.kq();
            if (TextUtils.isEmpty(this.syt)) {
                return new com.bytedance.sdk.component.rjo.oq(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            kqVar.oq(this.syt);
            if (this.kq == null) {
                return new com.bytedance.sdk.component.rjo.oq(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            kq(kqVar);
            kqVar.kq((Object) bob());
            suf sufVarOq = this.bob.kq(kqVar.kq(this.kq).oq()).oq();
            if (sufVarOq == null) {
                return null;
            }
            HashMap map = new HashMap();
            rhi rhiVarRjo = sufVarOq.rjo();
            if (rhiVarRjo != null) {
                for (int i10 = 0; i10 < rhiVarRjo.kq(); i10++) {
                    String strKq = rhiVarRjo.kq(i10);
                    String strOq = rhiVarRjo.oq(i10);
                    map.put(strKq, strOq);
                    if (strKq != null && strKq.equalsIgnoreCase("content-type")) {
                        map.put("content-type", strOq == null ? "" : strOq.toLowerCase());
                    }
                }
            }
            nze nzeVarRhi = sufVarOq.rhi();
            if (com.bytedance.sdk.component.rjo.bob.kq.kq(map)) {
                byte[] bArrFou = nzeVarRhi.fou();
                oqVar = new com.bytedance.sdk.component.rjo.oq(sufVarOq.fou(), sufVarOq.bob(), sufVarOq.csi(), map, null, sufVarOq.oq(), sufVarOq.kq());
                oqVar.kq(bArrFou);
            } else if (this.dgq) {
                byte[] bArrFou2 = nzeVarRhi.fou();
                oqVar = new com.bytedance.sdk.component.rjo.oq(sufVarOq.fou(), sufVarOq.bob(), sufVarOq.csi(), map, new String(bArrFou2, kq(kq(nzeVarRhi))), sufVarOq.oq(), sufVarOq.kq());
                oqVar.kq(bArrFou2);
            } else if (nzeVarRhi != null) {
                oqVar = new com.bytedance.sdk.component.rjo.oq(sufVarOq.fou(), sufVarOq.bob(), sufVarOq.csi(), map, nzeVarRhi.oq(), sufVarOq.oq(), sufVarOq.kq());
            } else {
                throw new IOException(sufVarOq.csi());
            }
            kq(oqVar, sufVarOq);
            return oqVar;
        } catch (Throwable th) {
            return new com.bytedance.sdk.component.rjo.oq(false, 5001, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void kq(String str, boolean z9) {
        if (z9) {
            kq("application/json; charset=utf-8", csi(str));
            oq("Content-Encoding", "gzip");
        } else {
            fou(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset kq(dgq dgqVar) {
        try {
            return dgqVar != null ? dgqVar.kq(com.bytedance.sdk.component.oq.kq.oq.dgq.kq) : com.bytedance.sdk.component.oq.kq.oq.dgq.kq;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.oq.kq.oq.dgq.kq;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dgq kq(nze nzeVar) {
        try {
            return nzeVar.csi();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(com.bytedance.sdk.component.rjo.oq oqVar, suf sufVar) {
        if (oqVar == null || sufVar == null) {
            return;
        }
        oqVar.kq(sufVar.syt());
    }
}
