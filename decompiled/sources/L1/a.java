package L1;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f3052a = new ConcurrentHashMap();

    public static synchronized void a(Context context, com.bykv.vk.openvk.kq.kq.kq.bob.a aVar, B1.a.InterfaceC0008a interfaceC0008a) {
        if (aVar == null) {
            return;
        }
        try {
            ConcurrentHashMap concurrentHashMap = f3052a;
            c cVar = (c) concurrentHashMap.get(aVar.sns());
            if (cVar == null) {
                cVar = new c(context, aVar);
                concurrentHashMap.put(aVar.sns(), cVar);
                aVar.rhi();
                aVar.sns();
            }
            cVar.i(interfaceC0008a);
            aVar.rhi();
            aVar.sns();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void b(com.bykv.vk.openvk.kq.kq.kq.bob.a aVar) {
        try {
            c cVar = (c) f3052a.remove(aVar.sns());
            if (cVar != null) {
                cVar.p(true);
            }
            aVar.rhi();
            aVar.sns();
        } catch (Throwable th) {
            throw th;
        }
    }
}
