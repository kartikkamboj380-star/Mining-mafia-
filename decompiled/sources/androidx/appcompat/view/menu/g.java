package androidx.appcompat.view.menu;

import O.AbstractC0842b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.protobuf.CodedOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class g implements H.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private View f7673A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private AbstractC0842b f7674B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f7675C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f7677E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f7682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f7683f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f7684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f7685h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f7687j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f7689l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    e f7691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m f7692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f7693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f7694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f7695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f7696s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f7703z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7686i = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7688k = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7690m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f7697t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f7698u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f7699v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f7700w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f7701x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f7702y = 16;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f7676D = false;

    class a implements AbstractC0842b.InterfaceC0066b {
        a() {
        }

        @Override // O.AbstractC0842b.InterfaceC0066b
        public void onActionProviderVisibilityChanged(boolean z9) {
            g gVar = g.this;
            gVar.f7691n.M(gVar);
        }
    }

    g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f7691n = eVar;
        this.f7678a = i11;
        this.f7679b = i10;
        this.f7680c = i12;
        this.f7681d = i13;
        this.f7682e = charSequence;
        this.f7703z = i14;
    }

    private static void d(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f7701x && (this.f7699v || this.f7700w)) {
            drawable = G.a.r(drawable).mutate();
            if (this.f7699v) {
                G.a.o(drawable, this.f7697t);
            }
            if (this.f7700w) {
                G.a.p(drawable, this.f7698u);
            }
            this.f7701x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f7691n.K() && g() != 0;
    }

    public boolean B() {
        return (this.f7703z & 4) == 4;
    }

    @Override // H.b
    public AbstractC0842b a() {
        return this.f7674B;
    }

    @Override // H.b
    public H.b b(AbstractC0842b abstractC0842b) {
        AbstractC0842b abstractC0842b2 = this.f7674B;
        if (abstractC0842b2 != null) {
            abstractC0842b2.g();
        }
        this.f7673A = null;
        this.f7674B = abstractC0842b;
        this.f7691n.N(true);
        AbstractC0842b abstractC0842b3 = this.f7674B;
        if (abstractC0842b3 != null) {
            abstractC0842b3.i(new a());
        }
        return this;
    }

    public void c() {
        this.f7691n.L(this);
    }

    @Override // H.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f7703z & 8) == 0) {
            return false;
        }
        if (this.f7673A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7675C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f7691n.f(this);
        }
        return false;
    }

    @Override // H.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7675C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f7691n.m(this);
        }
        return false;
    }

    public int f() {
        return this.f7681d;
    }

    char g() {
        return this.f7691n.J() ? this.f7687j : this.f7685h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // H.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f7673A;
        if (view != null) {
            return view;
        }
        AbstractC0842b abstractC0842b = this.f7674B;
        if (abstractC0842b == null) {
            return null;
        }
        View viewC = abstractC0842b.c(this);
        this.f7673A = viewC;
        return viewC;
    }

    @Override // H.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f7688k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f7687j;
    }

    @Override // H.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f7695r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f7679b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f7689l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f7690m == 0) {
            return null;
        }
        Drawable drawableB = p080i.a.b(this.f7691n.w(), this.f7690m);
        this.f7690m = 0;
        this.f7689l = drawableB;
        return e(drawableB);
    }

    @Override // H.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f7697t;
    }

    @Override // H.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f7698u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f7684g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f7678a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f7677E;
    }

    @Override // H.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f7686i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f7685h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f7680c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f7692o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f7682e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f7683f;
        return charSequence != null ? charSequence : this.f7682e;
    }

    @Override // H.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f7696s;
    }

    String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f7691n.w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f7691n.w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(p060g.h.f44022m));
        }
        int i10 = this.f7691n.J() ? this.f7688k : this.f7686i;
        d(sb, i10, 65536, resources.getString(p060g.h.f44018i));
        d(sb, i10, CodedOutputStream.DEFAULT_BUFFER_SIZE, resources.getString(p060g.h.f44014e));
        d(sb, i10, 2, resources.getString(p060g.h.f44013d));
        d(sb, i10, 1, resources.getString(p060g.h.f44019j));
        d(sb, i10, 4, resources.getString(p060g.h.f44021l));
        d(sb, i10, 8, resources.getString(p060g.h.f44017h));
        if (cG == '\b') {
            sb.append(resources.getString(p060g.h.f44015f));
        } else if (cG == '\n') {
            sb.append(resources.getString(p060g.h.f44016g));
        } else if (cG != ' ') {
            sb.append(cG);
        } else {
            sb.append(resources.getString(p060g.h.f44020k));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f7692o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.g()) ? getTitle() : getTitleCondensed();
    }

    @Override // H.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f7676D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f7702y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f7702y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f7702y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0842b abstractC0842b = this.f7674B;
        if (abstractC0842b == null || !abstractC0842b.f()) {
            return (this.f7702y & 8) == 0;
        }
        return (this.f7702y & 8) == 0 && this.f7674B.b();
    }

    public boolean j() {
        AbstractC0842b abstractC0842b;
        if ((this.f7703z & 8) != 0) {
            if (this.f7673A == null && (abstractC0842b = this.f7674B) != null) {
                this.f7673A = abstractC0842b.c(this);
            }
            if (this.f7673A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f7694q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f7691n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f7693p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f7684g != null) {
            try {
                this.f7691n.w().startActivity(this.f7684g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC0842b abstractC0842b = this.f7674B;
        return abstractC0842b != null && abstractC0842b.d();
    }

    public boolean l() {
        return (this.f7702y & 32) == 32;
    }

    public boolean m() {
        return (this.f7702y & 4) != 0;
    }

    public boolean n() {
        return (this.f7703z & 1) == 1;
    }

    public boolean o() {
        return (this.f7703z & 2) == 2;
    }

    @Override // H.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public H.b setActionView(int i10) {
        Context contextW = this.f7691n.w();
        setActionView(LayoutInflater.from(contextW).inflate(i10, (ViewGroup) new LinearLayout(contextW), false));
        return this;
    }

    @Override // H.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public H.b setActionView(View view) {
        int i10;
        this.f7673A = view;
        this.f7674B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f7678a) > 0) {
            view.setId(i10);
        }
        this.f7691n.L(this);
        return this;
    }

    public void r(boolean z9) {
        this.f7676D = z9;
        this.f7691n.N(false);
    }

    void s(boolean z9) {
        int i10 = this.f7702y;
        int i11 = (z9 ? 2 : 0) | (i10 & (-3));
        this.f7702y = i11;
        if (i10 != i11) {
            this.f7691n.N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f7687j == c10) {
            return this;
        }
        this.f7687j = Character.toLowerCase(c10);
        this.f7691n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z9) {
        int i10 = this.f7702y;
        int i11 = (z9 ? 1 : 0) | (i10 & (-2));
        this.f7702y = i11;
        if (i10 != i11) {
            this.f7691n.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z9) {
        if ((this.f7702y & 4) != 0) {
            this.f7691n.Y(this);
            return this;
        }
        s(z9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z9) {
        if (z9) {
            this.f7702y |= 16;
        } else {
            this.f7702y &= -17;
        }
        this.f7691n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f7690m = 0;
        this.f7689l = drawable;
        this.f7701x = true;
        this.f7691n.N(false);
        return this;
    }

    @Override // H.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f7697t = colorStateList;
        this.f7699v = true;
        this.f7701x = true;
        this.f7691n.N(false);
        return this;
    }

    @Override // H.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f7698u = mode;
        this.f7700w = true;
        this.f7701x = true;
        this.f7691n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f7684g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f7685h == c10) {
            return this;
        }
        this.f7685h = c10;
        this.f7691n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7675C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7694q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f7685h = c10;
        this.f7687j = Character.toLowerCase(c11);
        this.f7691n.N(false);
        return this;
    }

    @Override // H.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f7703z = i10;
        this.f7691n.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f7682e = charSequence;
        this.f7691n.N(false);
        m mVar = this.f7692o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7683f = charSequence;
        this.f7691n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z9) {
        if (y(z9)) {
            this.f7691n.M(this);
        }
        return this;
    }

    public void t(boolean z9) {
        this.f7702y = (z9 ? 4 : 0) | (this.f7702y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f7682e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z9) {
        if (z9) {
            this.f7702y |= 32;
        } else {
            this.f7702y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f7677E = contextMenuInfo;
    }

    @Override // H.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public H.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f7692o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z9) {
        int i10 = this.f7702y;
        int i11 = (z9 ? 0 : 8) | (i10 & (-9));
        this.f7702y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f7691n.C();
    }

    @Override // android.view.MenuItem
    public H.b setContentDescription(CharSequence charSequence) {
        this.f7695r = charSequence;
        this.f7691n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public H.b setTooltipText(CharSequence charSequence) {
        this.f7696s = charSequence;
        this.f7691n.N(false);
        return this;
    }

    @Override // H.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f7687j == c10 && this.f7688k == i10) {
            return this;
        }
        this.f7687j = Character.toLowerCase(c10);
        this.f7688k = KeyEvent.normalizeMetaState(i10);
        this.f7691n.N(false);
        return this;
    }

    @Override // H.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f7685h == c10 && this.f7686i == i10) {
            return this;
        }
        this.f7685h = c10;
        this.f7686i = KeyEvent.normalizeMetaState(i10);
        this.f7691n.N(false);
        return this;
    }

    @Override // H.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f7685h = c10;
        this.f7686i = KeyEvent.normalizeMetaState(i10);
        this.f7687j = Character.toLowerCase(c11);
        this.f7688k = KeyEvent.normalizeMetaState(i11);
        this.f7691n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f7689l = null;
        this.f7690m = i10;
        this.f7701x = true;
        this.f7691n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f7691n.w().getString(i10));
    }
}
