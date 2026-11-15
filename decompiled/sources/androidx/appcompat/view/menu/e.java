package androidx.appcompat.view.menu;

import O.AbstractC0842b;
import O.AbstractC0851f0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e implements H.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int[] f7642A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f7644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f7647e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f7655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CharSequence f7656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f7657o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f7658p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private g f7666x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f7668z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f7654l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f7659q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f7660r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f7661s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f7662t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f7663u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList f7664v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList f7665w = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f7667y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f7648f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f7649g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7650h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f7651i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f7652j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7653k = true;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean b(g gVar);
    }

    public e(Context context) {
        this.f7643a = context;
        this.f7644b = context.getResources();
        g0(true);
    }

    private static int D(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f7642A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void Q(int i10, boolean z9) {
        if (i10 < 0 || i10 >= this.f7648f.size()) {
            return;
        }
        this.f7648f.remove(i10);
        if (z9) {
            N(true);
        }
    }

    private void b0(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesE = E();
        if (view != null) {
            this.f7658p = view;
            this.f7656n = null;
            this.f7657o = null;
        } else {
            if (i10 > 0) {
                this.f7656n = resourcesE.getText(i10);
            } else if (charSequence != null) {
                this.f7656n = charSequence;
            }
            if (i11 > 0) {
                this.f7657o = C.b.e(w(), i11);
            } else if (drawable != null) {
                this.f7657o = drawable;
            }
            this.f7658p = null;
        }
        N(false);
    }

    private g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    private void g0(boolean z9) {
        boolean z10;
        if (z9) {
            z10 = this.f7644b.getConfiguration().keyboard != 1 && AbstractC0851f0.l(ViewConfiguration.get(this.f7643a), this.f7643a);
        }
        this.f7646d = z10;
    }

    private void i(boolean z9) {
        if (this.f7665w.isEmpty()) {
            return;
        }
        i0();
        for (WeakReference weakReference : this.f7665w) {
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f7665w.remove(weakReference);
            } else {
                jVar.i(z9);
            }
        }
        h0();
    }

    private void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f7665w.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : this.f7665w) {
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f7665w.remove(weakReference);
            } else {
                int id = jVar.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    jVar.f(parcelable);
                }
            }
        }
    }

    private void k(Bundle bundle) {
        Parcelable parcelableH;
        if (this.f7665w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : this.f7665w) {
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f7665w.remove(weakReference);
            } else {
                int id = jVar.getId();
                if (id > 0 && (parcelableH = jVar.h()) != null) {
                    sparseArray.put(id, parcelableH);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    private boolean l(m mVar, j jVar) {
        if (this.f7665w.isEmpty()) {
            return false;
        }
        boolean zG = jVar != null ? jVar.g(mVar) : false;
        for (WeakReference weakReference : this.f7665w) {
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null) {
                this.f7665w.remove(weakReference);
            } else if (!zG) {
                zG = jVar2.g(mVar);
            }
        }
        return zG;
    }

    private static int p(ArrayList arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.f7658p;
    }

    public ArrayList B() {
        t();
        return this.f7652j;
    }

    boolean C() {
        return this.f7662t;
    }

    Resources E() {
        return this.f7644b;
    }

    public e F() {
        return this;
    }

    public ArrayList G() {
        if (!this.f7650h) {
            return this.f7649g;
        }
        this.f7649g.clear();
        int size = this.f7648f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f7648f.get(i10);
            if (gVar.isVisible()) {
                this.f7649g.add(gVar);
            }
        }
        this.f7650h = false;
        this.f7653k = true;
        return this.f7649g;
    }

    public boolean H() {
        return !this.f7659q;
    }

    public boolean I() {
        return this.f7667y;
    }

    boolean J() {
        return this.f7645c;
    }

    public boolean K() {
        return this.f7646d;
    }

    void L(g gVar) {
        this.f7653k = true;
        N(true);
    }

    void M(g gVar) {
        this.f7650h = true;
        N(true);
    }

    public void N(boolean z9) {
        if (this.f7659q) {
            this.f7660r = true;
            if (z9) {
                this.f7661s = true;
                return;
            }
            return;
        }
        if (z9) {
            this.f7650h = true;
            this.f7653k = true;
        }
        i(z9);
    }

    public boolean O(MenuItem menuItem, int i10) {
        return P(menuItem, null, i10);
    }

    public boolean P(MenuItem menuItem, j jVar, int i10) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean zK = gVar.k();
        AbstractC0842b abstractC0842bA = gVar.a();
        boolean z9 = abstractC0842bA != null && abstractC0842bA.a();
        if (gVar.j()) {
            boolean zExpandActionView = gVar.expandActionView() | zK;
            if (zExpandActionView) {
                e(true);
            }
            return zExpandActionView;
        }
        if (!gVar.hasSubMenu() && !z9) {
            if ((i10 & 1) == 0) {
                e(true);
            }
            return zK;
        }
        if ((i10 & 4) == 0) {
            e(false);
        }
        if (!gVar.hasSubMenu()) {
            gVar.x(new m(w(), this, gVar));
        }
        m mVar = (m) gVar.getSubMenu();
        if (z9) {
            abstractC0842bA.e(mVar);
        }
        boolean zL = l(mVar, jVar) | zK;
        if (!zL) {
            e(true);
        }
        return zL;
    }

    public void R(j jVar) {
        for (WeakReference weakReference : this.f7665w) {
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f7665w.remove(weakReference);
            }
        }
    }

    public void S(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(v());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).S(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void T(Bundle bundle) {
        j(bundle);
    }

    public void U(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).U(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void V(Bundle bundle) {
        k(bundle);
    }

    public void W(a aVar) {
        this.f7647e = aVar;
    }

    public e X(int i10) {
        this.f7654l = i10;
        return this;
    }

    void Y(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f7648f.size();
        i0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f7648f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        h0();
    }

    protected e Z(int i10) {
        b0(0, null, i10, null, null);
        return this;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iD = D(i12);
        g gVarG = g(i10, i11, i12, iD, charSequence, this.f7654l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f7655m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f7648f;
        arrayList.add(p(arrayList, iD), gVarG);
        N(true);
        return gVarG;
    }

    protected e a0(Drawable drawable) {
        b0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f7643a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f7643a);
    }

    public void c(j jVar, Context context) {
        this.f7665w.add(new WeakReference(jVar));
        jVar.l(context, this);
        this.f7653k = true;
    }

    protected e c0(int i10) {
        b0(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f7666x;
        if (gVar != null) {
            f(gVar);
        }
        this.f7648f.clear();
        N(true);
    }

    public void clearHeader() {
        this.f7657o = null;
        this.f7656n = null;
        this.f7658p = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f7647e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    protected e d0(CharSequence charSequence) {
        b0(0, charSequence, 0, null, null);
        return this;
    }

    public final void e(boolean z9) {
        if (this.f7663u) {
            return;
        }
        this.f7663u = true;
        for (WeakReference weakReference : this.f7665w) {
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f7665w.remove(weakReference);
            } else {
                jVar.b(this, z9);
            }
        }
        this.f7663u = false;
    }

    protected e e0(View view) {
        b0(0, null, 0, null, view);
        return this;
    }

    public boolean f(g gVar) {
        boolean zK = false;
        if (!this.f7665w.isEmpty() && this.f7666x == gVar) {
            i0();
            for (WeakReference weakReference : this.f7665w) {
                j jVar = (j) weakReference.get();
                if (jVar != null) {
                    zK = jVar.k(this, gVar);
                    if (zK) {
                        break;
                    }
                } else {
                    this.f7665w.remove(weakReference);
                }
            }
            h0();
            if (zK) {
                this.f7666x = null;
            }
        }
        return zK;
    }

    public void f0(boolean z9) {
        this.f7668z = z9;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f7648f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return (MenuItem) this.f7648f.get(i10);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f7647e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public void h0() {
        this.f7659q = false;
        if (this.f7660r) {
            this.f7660r = false;
            N(this.f7661s);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f7668z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((g) this.f7648f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i0() {
        if (this.f7659q) {
            return;
        }
        this.f7659q = true;
        this.f7660r = false;
        this.f7661s = false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return r(i10, keyEvent) != null;
    }

    public boolean m(g gVar) {
        boolean zD = false;
        if (this.f7665w.isEmpty()) {
            return false;
        }
        i0();
        for (WeakReference weakReference : this.f7665w) {
            j jVar = (j) weakReference.get();
            if (jVar != null) {
                zD = jVar.d(this, gVar);
                if (zD) {
                    break;
                }
            } else {
                this.f7665w.remove(weakReference);
            }
        }
        h0();
        if (zD) {
            this.f7666x = gVar;
        }
        return zD;
    }

    public int n(int i10) {
        return o(i10, 0);
    }

    public int o(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (((g) this.f7648f.get(i11)).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return O(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g gVarR = r(i10, keyEvent);
        boolean zO = gVarR != null ? O(gVarR, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return zO;
    }

    public int q(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((g) this.f7648f.get(i11)).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    g r(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f7664v;
        arrayList.clear();
        s(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        boolean zJ = J();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) arrayList.get(i11);
            char alphabeticShortcut = zJ ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zJ && alphabeticShortcut == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iN = n(i10);
        if (iN >= 0) {
            int size = this.f7648f.size() - iN;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || ((g) this.f7648f.get(iN)).getGroupId() != i10) {
                    break;
                }
                Q(iN, false);
                i11 = i12;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        Q(q(i10), true);
    }

    void s(List list, int i10, KeyEvent keyEvent) {
        boolean zJ = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f7648f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = (g) this.f7648f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).s(list, i10, keyEvent);
                }
                char alphabeticShortcut = zJ ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zJ ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zJ && alphabeticShortcut == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z9, boolean z10) {
        int size = this.f7648f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f7648f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z10);
                gVar.setCheckable(z9);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z9) {
        this.f7667y = z9;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z9) {
        int size = this.f7648f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f7648f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z9);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z9) {
        int size = this.f7648f.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f7648f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z9)) {
                z10 = true;
            }
        }
        if (z10) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z9) {
        this.f7645c = z9;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f7648f.size();
    }

    public void t() {
        ArrayList arrayListG = G();
        if (this.f7653k) {
            boolean zJ = false;
            for (WeakReference weakReference : this.f7665w) {
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f7665w.remove(weakReference);
                } else {
                    zJ |= jVar.j();
                }
            }
            if (zJ) {
                this.f7651i.clear();
                this.f7652j.clear();
                int size = arrayListG.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = (g) arrayListG.get(i10);
                    if (gVar.l()) {
                        this.f7651i.add(gVar);
                    } else {
                        this.f7652j.add(gVar);
                    }
                }
            } else {
                this.f7651i.clear();
                this.f7652j.clear();
                this.f7652j.addAll(G());
            }
            this.f7653k = false;
        }
    }

    public ArrayList u() {
        t();
        return this.f7651i;
    }

    protected String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.f7643a;
    }

    public g x() {
        return this.f7666x;
    }

    public Drawable y() {
        return this.f7657o;
    }

    public CharSequence z() {
        return this.f7656n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f7644b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f7644b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f7643a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f7644b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f7644b.getString(i13));
    }
}
