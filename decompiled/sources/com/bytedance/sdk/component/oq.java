package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private static volatile Handler oq;
    private static final Object kq = new Object();
    private static final LinkedList<Runnable> bob = new LinkedList<>();
    private static Object fou = new Object();

    private static class kq extends Handler {
        kq(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    oq.bob();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void bob() {
        LinkedList linkedList;
        synchronized (fou) {
            try {
                synchronized (kq) {
                    LinkedList<Runnable> linkedList2 = bob;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    oq().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static Handler oq() {
        Handler handler;
        if (oq != null) {
            return oq;
        }
        synchronized (kq) {
            try {
                if (oq == null) {
                    com.bytedance.sdk.component.kq.InterfaceC0248kq interfaceC0248kq = com.bytedance.sdk.component.kq.kq;
                    HandlerThread handlerThreadKq = interfaceC0248kq != null ? interfaceC0248kq.kq("queued-work-looper", -2) : null;
                    if (handlerThreadKq == null) {
                        handlerThreadKq = new HandlerThread("queued-work-looper", -2);
                        handlerThreadKq.start();
                    }
                    oq = new kq(handlerThreadKq.getLooper());
                }
                handler = oq;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public static void kq(Runnable runnable, boolean z9) {
        try {
            Handler handlerOq = oq();
            synchronized (kq) {
                try {
                    bob.add(runnable);
                    if (z9) {
                        handlerOq.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        handlerOq.sendEmptyMessage(1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}
