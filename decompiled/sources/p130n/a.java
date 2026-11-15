package p130n;

import H.b;
import O.AbstractC0842b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.protobuf.CodedOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f46501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f46502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f46503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f46504g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f46506i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f46508k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f46509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f46510m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f46511n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f46512o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f46505h = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f46507j = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f46513p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f46514q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f46515r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f46516s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f46517t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f46509l = context;
        this.f46498a = i11;
        this.f46499b = i10;
        this.f46500c = i13;
        this.f46501d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f46508k;
        if (drawable != null) {
            if (this.f46515r || this.f46516s) {
                Drawable drawableR = G.a.r(drawable);
                this.f46508k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f46508k = drawableMutate;
                if (this.f46515r) {
                    G.a.o(drawableMutate, this.f46513p);
                }
                if (this.f46516s) {
                    G.a.p(this.f46508k, this.f46514q);
                }
            }
        }
    }

    @Override // H.b
    public AbstractC0842b a() {
        return null;
    }

    @Override // H.b
    public b b(AbstractC0842b abstractC0842b) {
        throw new UnsupportedOperationException();
    }

    @Override // H.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // H.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // H.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // H.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // H.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // H.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // H.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f46507j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f46506i;
    }

    @Override // H.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f46511n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f46499b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f46508k;
    }

    @Override // H.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f46513p;
    }

    @Override // H.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f46514q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f46503f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f46498a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // H.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f46505h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f46504g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f46500c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f46501d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f46502e;
        return charSequence != null ? charSequence : this.f46501d;
    }

    @Override // H.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f46512o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // H.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f46517t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f46517t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f46517t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f46517t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f46506i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z9) {
        this.f46517t = (z9 ? 1 : 0) | (this.f46517t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z9) {
        this.f46517t = (z9 ? 2 : 0) | (this.f46517t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z9) {
        this.f46517t = (z9 ? 16 : 0) | (this.f46517t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f46508k = drawable;
        c();
        return this;
    }

    @Override // H.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f46513p = colorStateList;
        this.f46515r = true;
        c();
        return this;
    }

    @Override // H.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f46514q = mode;
        this.f46516s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f46503f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f46504g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f46510m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f46504g = c10;
        this.f46506i = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f46501d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f46502e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z9) {
        this.f46517t = (this.f46517t & 8) | (z9 ? 0 : 8);
        return this;
    }

    @Override // H.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f46506i = Character.toLowerCase(c10);
        this.f46507j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public b setContentDescription(CharSequence charSequence) {
        this.f46511n = charSequence;
        return this;
    }

    @Override // H.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f46504g = c10;
        this.f46505h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f46501d = this.f46509l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public b setTooltipText(CharSequence charSequence) {
        this.f46512o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f46508k = C.b.e(this.f46509l, i10);
        c();
        return this;
    }

    @Override // H.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f46504g = c10;
        this.f46505h = KeyEvent.normalizeMetaState(i10);
        this.f46506i = Character.toLowerCase(c11);
        this.f46507j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // H.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }
}
