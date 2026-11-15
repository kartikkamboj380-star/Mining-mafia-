package com.bytedance.sdk.openadsdk.bob;

import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.utils.nz;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class nn {
    private FilterWord fax;
    private int gm;
    private String mxq;
    private JSONObject nze;
    protected IListenerManager rhi;
    private uml sns;
    private String suf;
    private String ubx;
    private String vvw;
    private int wcx;
    private String wki;
    public static FilterWord kq = new FilterWord("", "");
    public static int oq = 1;
    public static int bob = 2;
    public static int fou = 3;
    public static int csi = 4;
    private final Set<bob> rjo = new HashSet();
    private final Set<oq> syt = new HashSet();
    private final Set<fou> dgq = new HashSet();
    private final Set<kq> nn = new HashSet();

    public interface bob {
        void kq(FilterWord filterWord);
    }

    public interface fou {
        void kq(String str);
    }

    public interface kq {
        void kq(List<FilterWord> list);
    }

    public interface oq {
        void kq(int i10);
    }

    private void nn() {
        Iterator<bob> it = this.rjo.iterator();
        while (it.hasNext()) {
            it.next().kq(this.fax);
        }
    }

    public boolean bob() {
        FilterWord filterWord = this.fax;
        return (filterWord == null || filterWord.equals(kq)) ? false : true;
    }

    public void csi() {
        Iterator<oq> it = this.syt.iterator();
        while (it.hasNext()) {
            it.next().kq(bob);
        }
    }

    public boolean dgq() {
        return this.wcx < this.gm;
    }

    public void fou() {
        if (!bob() && !TextUtils.isEmpty(this.suf)) {
            this.fax = new FilterWord("0:00", this.suf);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.fax);
        if (!TextUtils.isEmpty(this.ubx)) {
            if (TextUtils.isEmpty(this.suf)) {
                com.bytedance.sdk.openadsdk.bob.oq.kq().kq(this.ubx, arrayList, this.vvw);
            } else {
                if (this.nze == null) {
                    uml umlVar = this.sns;
                    if (umlVar != null) {
                        this.nze = umlVar.ezl();
                    } else {
                        try {
                            this.nze = new JSONObject(this.mxq);
                        } catch (Throwable th) {
                            fax.kq("TTDislikeManager", "creative info to json exception", th);
                        }
                    }
                }
                com.bytedance.sdk.openadsdk.bob.oq.kq().kq(this.ubx, arrayList, this.nze, this.suf, this.vvw);
            }
        }
        if (!TextUtils.isEmpty(this.wki)) {
            if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
                fou("onItemClickClosed");
            } else {
                com.bytedance.sdk.openadsdk.core.fou.rjo.kq kqVarCsi = com.bytedance.sdk.openadsdk.core.dgq.oq().csi(this.wki);
                if (kqVarCsi != null) {
                    kqVarCsi.kq();
                    com.bytedance.sdk.openadsdk.core.dgq.oq().rhi(this.wki);
                }
            }
        }
        Iterator<oq> it = this.syt.iterator();
        while (it.hasNext()) {
            it.next().kq(oq);
        }
        kq(kq);
        bob("");
    }

    public void oq(String str) {
        this.vvw = str;
    }

    public void rhi() {
        Iterator<oq> it = this.syt.iterator();
        while (it.hasNext()) {
            it.next().kq(csi);
        }
    }

    public String rjo() {
        return this.suf;
    }

    public int syt() {
        return this.wcx;
    }

    public void bob(String str) {
        this.suf = str;
        Iterator<fou> it = this.dgq.iterator();
        while (it.hasNext()) {
            it.next().kq(this.suf);
        }
    }

    public void kq() {
        this.rjo.clear();
        this.syt.clear();
        this.dgq.clear();
        this.nn.clear();
    }

    public FilterWord oq() {
        return this.fax;
    }

    public void kq(String str) {
        this.ubx = str;
    }

    public void kq(FilterWord filterWord) {
        this.fax = filterWord;
        nn();
    }

    public void kq(bob bobVar) {
        this.rjo.add(bobVar);
    }

    public void kq(oq oqVar) {
        this.syt.add(oqVar);
    }

    public void kq(fou fouVar) {
        this.dgq.add(fouVar);
    }

    public void kq(kq kqVar) {
        this.nn.add(kqVar);
    }

    public void kq(List<FilterWord> list) {
        Iterator<kq> it = this.nn.iterator();
        while (it.hasNext()) {
            it.next().kq(list);
        }
    }

    protected IListenerManager kq(int i10) {
        if (this.rhi == null) {
            this.rhi = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.kq.kq().kq(i10));
        }
        return this.rhi;
    }

    public static void kq(final int i10, final String str, final com.bytedance.sdk.openadsdk.core.fou.rjo.kq kqVar) {
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            nz.bob(new com.bytedance.sdk.component.syt.syt("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.bob.nn.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.kq kqVarKq = com.bytedance.sdk.openadsdk.multipro.aidl.kq.kq();
                    if (i10 != 6 || kqVar == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.multipro.aidl.oq.oq oqVar = new com.bytedance.sdk.openadsdk.multipro.aidl.oq.oq(str, kqVar);
                        IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(kqVarKq.kq(6));
                        if (iListenerManagerAsInterface != null) {
                            iListenerManagerAsInterface.registerDisLikeClosedListener(str, oqVar);
                        }
                    } catch (RemoteException e10) {
                        fax.bob("TTDislikeManager", e10.getMessage());
                    }
                }
            }, 5);
        }
    }

    public static void kq(final int i10, final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.oq.bob()) {
            nz.bob(new com.bytedance.sdk.component.syt.syt("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.bob.nn.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.kq kqVarKq = com.bytedance.sdk.openadsdk.multipro.aidl.kq.kq();
                    if (i10 == 6) {
                        try {
                            IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(kqVarKq.kq(6));
                            if (iListenerManagerAsInterface != null) {
                                iListenerManagerAsInterface.unregisterDisLikeClosedListener(str);
                            }
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }, 5);
        }
    }

    private void fou(final String str) {
        nz.bob(new com.bytedance.sdk.component.syt.syt("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.bob.nn.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (TextUtils.isEmpty(nn.this.wki)) {
                        return;
                    }
                    nn.this.kq(6).executeDisLikeClosedCallback(nn.this.wki, str);
                } catch (Throwable th) {
                    fax.kq("TTDislikeManager", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    public void kq(String str, uml umlVar) {
        this.mxq = str;
        this.sns = umlVar;
    }

    public void kq(int i10, int i11) {
        this.wcx = i10;
        this.gm = i11;
    }
}
