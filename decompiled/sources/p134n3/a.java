package p134n3;

import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p070h.w;
import p144o3.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements UIManagerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f46675a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f46676b = new ArrayList();

    public final synchronized void a(p144o3.a block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f46676b.add(block);
    }

    public final synchronized void b(p144o3.a block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f46675a.add(block);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        didMountItems(uiManager);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        if (uiManager instanceof b) {
            synchronized (this) {
                if (this.f46676b.isEmpty()) {
                    return;
                }
                List listW0 = CollectionsKt.w0(this.f46676b);
                this.f46676b.clear();
                Iterator it = listW0.iterator();
                if (it.hasNext()) {
                    w.a(it.next());
                    throw null;
                }
            }
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        willMountItems(uiManager);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        if (uiManager instanceof b) {
            synchronized (this) {
                if (this.f46675a.isEmpty()) {
                    return;
                }
                List listW0 = CollectionsKt.w0(this.f46675a);
                this.f46675a.clear();
                Iterator it = listW0.iterator();
                if (it.hasNext()) {
                    w.a(it.next());
                    throw null;
                }
            }
        }
    }
}
