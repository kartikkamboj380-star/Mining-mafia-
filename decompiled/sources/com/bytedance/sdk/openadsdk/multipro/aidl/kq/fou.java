package com.bytedance.sdk.openadsdk.multipro.aidl.kq;

import android.os.RemoteCallbackList;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class fou extends kq {
    public static ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> kq = new ConcurrentHashMap<>();
    private static volatile fou oq;

    public static fou kq() {
        if (oq == null) {
            synchronized (fou.class) {
                try {
                    if (oq == null) {
                        oq = new fou();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oq;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.kq.kq, com.bytedance.sdk.openadsdk.IListenerManager
    public void executeDisLikeClosedCallback(String str, String str2) {
        kq(str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.kq.kq, com.bytedance.sdk.openadsdk.IListenerManager
    public synchronized void registerDisLikeClosedListener(String str, IDislikeClosedListener iDislikeClosedListener) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iDislikeClosedListener);
        kq.put(str, remoteCallbackList);
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.kq.kq, com.bytedance.sdk.openadsdk.IListenerManager
    public void unregisterDisLikeClosedListener(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        kq.remove(str);
    }

    private synchronized void kq(String str, String str2) {
        RemoteCallbackList<IDislikeClosedListener> remoteCallbackList;
        try {
            ConcurrentHashMap<String, RemoteCallbackList<IDislikeClosedListener>> concurrentHashMap = kq;
            if (concurrentHashMap != null && (remoteCallbackList = concurrentHashMap.get(str)) != null) {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
                    try {
                        IDislikeClosedListener iDislikeClosedListener = (IDislikeClosedListener) remoteCallbackList.getBroadcastItem(i10);
                        if (iDislikeClosedListener != null && "onItemClickClosed".equals(str2)) {
                            iDislikeClosedListener.onItemClickClosed();
                        }
                    } catch (Throwable th) {
                        fax.kq("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th);
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th2) {
            fax.kq("MultiProcess", "dislike '" + str2 + "'  throws Exception :", th2);
        }
    }
}
