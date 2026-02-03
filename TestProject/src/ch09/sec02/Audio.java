package ch09.sec02;

public class Audio implements IRemoteControl {
    //멤버 필드
    private int volume;
    private boolean mute;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > IRemoteControl.MAX_VOLUME){
            this.volume = MAX_VOLUME;
        } else if(volume < IRemoteControl.MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }

    }

    //default 재정의 가능
    //default를 재정의 할 경우 default는 적지 않는다.
    @Override
    public void setMute(boolean mute) {
        this.mute = mute;
        if(this.mute) {
            System.out.println("Audio 무음 처리 합니다.");
        } else {
            System.out.println("Audio 무음 해제 합니다.");
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
}
