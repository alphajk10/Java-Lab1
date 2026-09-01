// Task 2 - Smart Device Control System
// Interfaces & Multiple Inheritance
// All classes in one file

// Interface for Wi-Fi feature
interface WiFiEnabled {
    void connectWiFi();
}

// Interface for Voice Control
interface VoiceControlled {
    void voiceControl();
}

// Interface for Music Player
interface MusicPlayer {
    void playMusic();
}

// Interface for Video Streaming
interface VideoStreaming {
    void playVideo();
}

// Interface for Temperature Monitoring
interface TemperatureMonitor {
    void monitorTemperature();
}

// Smart TV Class
class SmartTV implements WiFiEnabled, MusicPlayer, VideoStreaming {

    @Override
    public void connectWiFi() {
        System.out.println("Wi-Fi Connected");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music");
    }

    @Override
    public void playVideo() {
        System.out.println("Streaming Video");
    }
}

// Smart Speaker Class
class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {

    @Override
    public void connectWiFi() {
        System.out.println("Wi-Fi Connected");
    }

    @Override
    public void voiceControl() {
        System.out.println("Voice Command Activated");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music");
    }
}

// Smart Air Conditioner
class SmartAC implements WiFiEnabled, TemperatureMonitor {

    @Override
    public void connectWiFi() {
        System.out.println("Wi-Fi Connected");
    }

    @Override
    public void monitorTemperature() {
        System.out.println("Temperature : 24°C");
    }
}

// Smart Watch
class SmartWatch implements WiFiEnabled, TemperatureMonitor {

    @Override
    public void connectWiFi() {
        System.out.println("Wi-Fi Connected");
    }

    @Override
    public void monitorTemperature() {
        System.out.println("Body Temperature : 36.8°C");
    }
}

// Smart Car
class SmartCar implements WiFiEnabled,
        VoiceControlled,
        MusicPlayer,
        VideoStreaming {

    @Override
    public void connectWiFi() {
        System.out.println("Wi-Fi Connected");
    }

    @Override
    public void voiceControl() {
        System.out.println("Voice Control Enabled");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music");
    }

    @Override
    public void playVideo() {
        System.out.println("Streaming Video");
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Creating Multiple Objects
        SmartTV tv = new SmartTV();
        SmartSpeaker speaker = new SmartSpeaker();
        SmartAC ac = new SmartAC();
        SmartWatch watch = new SmartWatch();
        SmartCar car = new SmartCar();

        System.out.println("========== SMART TV ==========");
        tv.connectWiFi();
        tv.playMusic();
        tv.playVideo();

        System.out.println("\n========== SMART SPEAKER ==========");
        speaker.connectWiFi();
        speaker.voiceControl();
        speaker.playMusic();

        System.out.println("\n========== SMART AIR CONDITIONER ==========");
        ac.connectWiFi();
        ac.monitorTemperature();

        System.out.println("\n========== SMART WATCH ==========");
        watch.connectWiFi();
        watch.monitorTemperature();

        System.out.println("\n========== SMART CAR ==========");
        car.connectWiFi();
        car.voiceControl();
        car.playMusic();
        car.playVideo();
    }
}