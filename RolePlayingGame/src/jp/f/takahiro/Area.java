package jp.f.takahiro;

public abstract class Area {
	private String areaName;

	// エリアで何らかの行動をする
	public abstract void action();

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

}
