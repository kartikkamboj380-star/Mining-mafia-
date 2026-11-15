package com.bytedance.sdk.component.csi.fou.bob;

import com.bytedance.sdk.component.csi.gm;
import com.bytedance.sdk.component.csi.mxq;
import com.bytedance.sdk.component.csi.ubx;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class kq<T> {
    private bob kq;
    private gm oq;

    public kq(bob bobVar, gm gmVar) {
        this.kq = bobVar;
        this.oq = gmVar;
    }

    public void kq(ubx<T> ubxVar) {
        try {
            gm gmVar = this.oq;
            if (gmVar != null) {
                gmVar.kq("success", this.kq);
            }
            String strFax = this.kq.fax();
            Map<String, List<bob>> mapDgq = this.kq.sns().dgq();
            List<bob> list = mapDgq.get(strFax);
            if (list == null) {
                mxq mxqVarSyt = this.kq.syt();
                if (mxqVarSyt != null) {
                    mxqVarSyt.toString();
                    this.kq.nn();
                    mxqVarSyt.kq(ubxVar);
                }
            } else {
                synchronized (list) {
                    try {
                        list.size();
                        for (bob bobVar : list) {
                            mxq mxqVarSyt2 = bobVar.syt();
                            if (mxqVarSyt2 != null) {
                                mxqVarSyt2.toString();
                                bobVar.nn();
                                mxqVarSyt2.kq(ubxVar);
                            }
                        }
                        list.clear();
                        mapDgq.remove(strFax);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            gm gmVar2 = this.oq;
            if (gmVar2 != null) {
                gmVar2.oq("success", this.kq);
            }
        } catch (Throwable unused) {
        }
    }

    public void kq(int i10, String str, Throwable th) {
        try {
            gm gmVar = this.oq;
            if (gmVar != null) {
                gmVar.kq("failed", this.kq);
            }
            String strFax = this.kq.fax();
            Map<String, List<bob>> mapDgq = this.kq.sns().dgq();
            List<bob> list = mapDgq.get(strFax);
            if (list == null) {
                mxq mxqVarSyt = this.kq.syt();
                if (mxqVarSyt != null) {
                    mxqVarSyt.kq(i10, str, th);
                }
            } else {
                synchronized (list) {
                    try {
                        Iterator<bob> it = list.iterator();
                        while (it.hasNext()) {
                            mxq mxqVarSyt2 = it.next().syt();
                            if (mxqVarSyt2 != null) {
                                mxqVarSyt2.toString();
                                mxqVarSyt2.kq(i10, str, th);
                            }
                        }
                        list.clear();
                        mapDgq.remove(strFax);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            gm gmVar2 = this.oq;
            if (gmVar2 != null) {
                gmVar2.oq("failed", this.kq);
            }
        } catch (Throwable unused) {
        }
    }
}
