package com.bytedance.sdk.component.oq.kq.kq.kq;

import android.text.TextUtils;
import com.bytedance.sdk.component.oq.kq.nze;
import com.bytedance.sdk.component.oq.kq.suf;
import com.bytedance.sdk.component.oq.kq.vvw;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class syt extends suf {
    public static int kq = -1;
    vvw bob;
    String csi;
    int fou;
    HttpURLConnection oq;

    public syt(HttpURLConnection httpURLConnection, vvw vvwVar) {
        this.fou = kq;
        this.oq = httpURLConnection;
        this.bob = vvwVar;
    }

    @Override // com.bytedance.sdk.component.oq.kq.suf
    public int bob() {
        try {
            return this.oq.getResponseCode();
        } catch (Exception unused) {
            return this.fou;
        }
    }

    @Override // com.bytedance.sdk.component.oq.kq.suf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            rhi().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.oq.kq.suf
    public String csi() {
        return !TextUtils.isEmpty(this.csi) ? this.csi : this.oq.getResponseMessage();
    }

    public vvw dgq() {
        return this.bob;
    }

    @Override // com.bytedance.sdk.component.oq.kq.suf
    public boolean fou() {
        return bob() >= 200 && bob() < 300;
    }

    @Override // com.bytedance.sdk.component.oq.kq.suf
    public long kq() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.oq.kq.suf
    public long oq() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.oq.kq.suf
    public nze rhi() {
        dgq dgqVar;
        com.bytedance.sdk.component.bob.kq.kq kqVar;
        com.bytedance.sdk.component.bob.kq.kq kqVar2;
        vvw vvwVar = this.bob;
        if (vvwVar != null && (kqVar2 = vvwVar.oq) != null) {
            kqVar2.ubx();
        }
        try {
            try {
                dgqVar = new dgq(this.oq);
            } catch (Exception unused) {
                HttpURLConnection httpURLConnection = this.oq;
                dgqVar = new dgq(httpURLConnection, httpURLConnection.getErrorStream());
            }
        } catch (Throwable th) {
            th.getMessage();
            dgqVar = null;
        }
        vvw vvwVar2 = this.bob;
        if (vvwVar2 != null && (kqVar = vvwVar2.oq) != null) {
            kqVar.wki();
        }
        return dgqVar;
    }

    @Override // com.bytedance.sdk.component.oq.kq.suf
    public com.bytedance.sdk.component.oq.kq.rhi rjo() {
        if (this.oq == null) {
            return new com.bytedance.sdk.component.oq.kq.rhi(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.oq.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || bob() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.oq.kq.rhi((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.oq.kq.suf
    public com.bytedance.sdk.component.oq.kq.nn syt() {
        if (dgq() == null || dgq().oq == null) {
            return null;
        }
        return new com.bytedance.sdk.component.oq.kq.nn(dgq().oq);
    }

    public String toString() {
        return "";
    }

    public syt(int i10, String str, vvw vvwVar) {
        this.csi = str;
        this.bob = vvwVar;
        this.fou = i10;
    }
}
