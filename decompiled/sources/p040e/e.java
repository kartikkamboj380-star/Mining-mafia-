package p040e;

import G8.j;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.InterfaceC1168n;
import androidx.lifecycle.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f43202h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f43203a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f43204b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f43205c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f43206d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Map f43207e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f43208f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f43209g = new Bundle();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p040e.b f43210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p050f.a f43211b;

        public a(p040e.b callback, p050f.a contract) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(contract, "contract");
            this.f43210a = callback;
            this.f43211b = contract;
        }

        public final p040e.b a() {
            return this.f43210a;
        }

        public final p050f.a b() {
            return this.f43211b;
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1164j f43212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f43213b;

        public c(AbstractC1164j lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.f43212a = lifecycle;
            this.f43213b = new ArrayList();
        }

        public final void a(InterfaceC1168n observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.f43212a.a(observer);
            this.f43213b.add(observer);
        }

        public final void b() {
            Iterator it = this.f43213b.iterator();
            while (it.hasNext()) {
                this.f43212a.d((InterfaceC1168n) it.next());
            }
            this.f43213b.clear();
        }
    }

    static final class d extends m implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f43214a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(kotlin.random.c.f45991a.d(2147418112) + 65536);
        }
    }

    /* JADX INFO: renamed from: e.e$e, reason: collision with other inner class name */
    public static final class C0415e extends p040e.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p050f.a f43217c;

        C0415e(String str, p050f.a aVar) {
            this.f43216b = str;
            this.f43217c = aVar;
        }

        @Override // p040e.c
        public void b(Object obj, androidx.core.app.c cVar) throws Exception {
            Object obj2 = e.this.f43204b.get(this.f43216b);
            p050f.a aVar = this.f43217c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                e.this.f43206d.add(this.f43216b);
                try {
                    e.this.i(iIntValue, this.f43217c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    e.this.f43206d.remove(this.f43216b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p040e.c
        public void c() {
            e.this.p(this.f43216b);
        }
    }

    public static final class f extends p040e.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p050f.a f43220c;

        f(String str, p050f.a aVar) {
            this.f43219b = str;
            this.f43220c = aVar;
        }

        @Override // p040e.c
        public void b(Object obj, androidx.core.app.c cVar) throws Exception {
            Object obj2 = e.this.f43204b.get(this.f43219b);
            p050f.a aVar = this.f43220c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                e.this.f43206d.add(this.f43219b);
                try {
                    e.this.i(iIntValue, this.f43220c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    e.this.f43206d.remove(this.f43219b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // p040e.c
        public void c() {
            e.this.p(this.f43219b);
        }
    }

    private final void d(int i10, String str) {
        this.f43203a.put(Integer.valueOf(i10), str);
        this.f43204b.put(str, Integer.valueOf(i10));
    }

    private final void g(String str, int i10, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f43206d.contains(str)) {
            this.f43208f.remove(str);
            this.f43209g.putParcelable(str, new p040e.a(i10, intent));
        } else {
            aVar.a().onActivityResult(aVar.b().c(i10, intent));
            this.f43206d.remove(str);
        }
    }

    private final int h() {
        for (Number number : j.g(d.f43214a)) {
            if (!this.f43203a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(e this$0, String key, p040e.b callback, p050f.a contract, r rVar, AbstractC1164j.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(contract, "$contract");
        Intrinsics.checkNotNullParameter(rVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (AbstractC1164j.a.ON_START != event) {
            if (AbstractC1164j.a.ON_STOP == event) {
                this$0.f43207e.remove(key);
                return;
            } else {
                if (AbstractC1164j.a.ON_DESTROY == event) {
                    this$0.p(key);
                    return;
                }
                return;
            }
        }
        this$0.f43207e.put(key, new a(callback, contract));
        if (this$0.f43208f.containsKey(key)) {
            Object obj = this$0.f43208f.get(key);
            this$0.f43208f.remove(key);
            callback.onActivityResult(obj);
        }
        p040e.a aVar = (p040e.a) K.c.a(this$0.f43209g, key, p040e.a.class);
        if (aVar != null) {
            this$0.f43209g.remove(key);
            callback.onActivityResult(contract.c(aVar.b(), aVar.a()));
        }
    }

    private final void o(String str) {
        if (((Integer) this.f43204b.get(str)) != null) {
            return;
        }
        d(h(), str);
    }

    public final boolean e(int i10, int i11, Intent intent) {
        String str = (String) this.f43203a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        g(str, i11, intent, (a) this.f43207e.get(str));
        return true;
    }

    public final boolean f(int i10, Object obj) {
        String str = (String) this.f43203a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f43207e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f43209g.remove(str);
            this.f43208f.put(str, obj);
            return true;
        }
        p040e.b bVarA = aVar.a();
        Intrinsics.d(bVarA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f43206d.remove(str)) {
            return true;
        }
        bVarA.onActivityResult(obj);
        return true;
    }

    public abstract void i(int i10, p050f.a aVar, Object obj, androidx.core.app.c cVar);

    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f43206d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f43209g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.f43204b.containsKey(str)) {
                Integer num = (Integer) this.f43204b.remove(str);
                if (!this.f43209g.containsKey(str)) {
                    I.b(this.f43203a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i10);
            Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i10);
            Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
            d(iIntValue, str2);
        }
    }

    public final void k(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f43204b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f43204b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f43206d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f43209g));
    }

    public final p040e.c l(final String key, r lifecycleOwner, final p050f.a contract, final p040e.b callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC1164j lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().d(AbstractC1164j.b.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(key);
        c cVar = (c) this.f43205c.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new InterfaceC1168n() { // from class: e.d
            @Override // androidx.lifecycle.InterfaceC1168n
            public final void onStateChanged(r rVar, AbstractC1164j.a aVar) {
                e.n(this.f43198a, key, callback, contract, rVar, aVar);
            }
        });
        this.f43205c.put(key, cVar);
        return new C0415e(key, contract);
    }

    public final p040e.c m(String key, p050f.a contract, p040e.b callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        o(key);
        this.f43207e.put(key, new a(callback, contract));
        if (this.f43208f.containsKey(key)) {
            Object obj = this.f43208f.get(key);
            this.f43208f.remove(key);
            callback.onActivityResult(obj);
        }
        p040e.a aVar = (p040e.a) K.c.a(this.f43209g, key, p040e.a.class);
        if (aVar != null) {
            this.f43209g.remove(key);
            callback.onActivityResult(contract.c(aVar.b(), aVar.a()));
        }
        return new f(key, contract);
    }

    public final void p(String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f43206d.contains(key) && (num = (Integer) this.f43204b.remove(key)) != null) {
            this.f43203a.remove(num);
        }
        this.f43207e.remove(key);
        if (this.f43208f.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f43208f.get(key));
            this.f43208f.remove(key);
        }
        if (this.f43209g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((p040e.a) K.c.a(this.f43209g, key, p040e.a.class)));
            this.f43209g.remove(key);
        }
        c cVar = (c) this.f43205c.get(key);
        if (cVar != null) {
            cVar.b();
            this.f43205c.remove(key);
        }
    }
}
