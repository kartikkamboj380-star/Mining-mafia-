package P1;

import com.ctpool.updater.UpdaterModule;
import com.facebook.react.N;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i implements N {
    @Override // com.facebook.react.N
    public List createNativeModules(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return CollectionsKt.d(new UpdaterModule(context));
    }

    @Override // com.facebook.react.N
    public List createViewManagers(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return CollectionsKt.i();
    }
}
