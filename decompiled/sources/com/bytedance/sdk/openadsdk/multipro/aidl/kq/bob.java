package com.bytedance.sdk.openadsdk.multipro.aidl.kq;

import android.os.RemoteCallbackList;
import com.bytedance.sdk.openadsdk.ICommonPermissionListener;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class bob extends kq {
    private static final HashMap<String, RemoteCallbackList<ICommonPermissionListener>> kq = new HashMap<>();
    private static volatile bob oq;

    public static bob kq() {
        if (oq == null) {
            synchronized (bob.class) {
                try {
                    if (oq == null) {
                        oq = new bob();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oq;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.kq.kq, com.bytedance.sdk.openadsdk.IListenerManager
    public void broadcastPermissionListener(String str, String str2) {
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackListRemove = kq.remove(str);
        if (remoteCallbackListRemove == null) {
            return;
        }
        int iBeginBroadcast = remoteCallbackListRemove.beginBroadcast();
        for (int i10 = 0; i10 < iBeginBroadcast; i10++) {
            ICommonPermissionListener iCommonPermissionListener = (ICommonPermissionListener) remoteCallbackListRemove.getBroadcastItem(i10);
            if (iCommonPermissionListener != null) {
                if (str2 == null) {
                    iCommonPermissionListener.onGranted();
                } else {
                    iCommonPermissionListener.onDenied(str2);
                }
            }
        }
        remoteCallbackListRemove.finishBroadcast();
        remoteCallbackListRemove.kill();
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.aidl.kq.kq, com.bytedance.sdk.openadsdk.IListenerManager
    public void registerPermissionListener(String str, ICommonPermissionListener iCommonPermissionListener) {
        if (iCommonPermissionListener == null) {
            return;
        }
        RemoteCallbackList<ICommonPermissionListener> remoteCallbackList = new RemoteCallbackList<>();
        remoteCallbackList.register(iCommonPermissionListener);
        kq.put(str, remoteCallbackList);
    }
}
